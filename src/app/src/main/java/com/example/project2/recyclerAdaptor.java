package com.example.project2;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


//this class is for display the recycler view. And this classed is used in three parts:
//top pick panel, product detail image and recommendation panel.
public class recyclerAdaptor extends RecyclerView.Adapter<recyclerAdaptor.MyViewHolder> {
    private List<Product> itemsList;
    Context mContext;
    private  boolean mainRecycler,RandomItem;
    private RecyclerViewClickListener listener;



    //since three different parts used the same adapter, so we have to create three constructors.
    //this constructor is for top pick panel.
    public  recyclerAdaptor(List<Product> itemsList, @NonNull Context context, boolean mainRecycler
    ,RecyclerViewClickListener listener){
        this.itemsList = itemsList;
        this.mContext = context;
        this.mainRecycler = mainRecycler;
        this.listener = listener;
    }

    //this constructor is for recommendation panel.
    public  recyclerAdaptor(List<Product> itemsList, @NonNull Context context, boolean mainRecycler
            ,RecyclerViewClickListener listener, boolean RandomItem){
        this.itemsList = itemsList;
        this.mContext = context;
        this.mainRecycler = mainRecycler;
        this.listener = listener;
        this.RandomItem = RandomItem;
    }



    //this constructor is for detail image.
    public  recyclerAdaptor(List<Product> itemsList, @NonNull Context context, boolean mainRecycler
           ){
        this.itemsList = itemsList;
        this.mContext = context;
        this.mainRecycler = mainRecycler;
    }


    //the class of view holder of the adaptor.
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView nameText;
        private ImageView image;
        private TextView priceText;
        private CardView cardView;

        public MyViewHolder(final View view ,boolean main) {
            super(view);
            if(main) {
                //Set the attributed of views
                image = view.findViewById(R.id.main_recycler_imageView);
                nameText = view.findViewById(R.id.main_recycler_textView_productTxt);
                priceText =view.findViewById(R.id.main_recycler_textView_productPrice);
                cardView = view.findViewById(R.id.top_pick_cardview);
                view.setOnClickListener(this);
            }else{
                image = view.findViewById(R.id.detail_recycler_imageView);
            }

        }
        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }


    @NonNull
    @Override
    //create view holder.
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(mainRecycler){
            //if the recycler is inside main activity, which means it's top pick panel, then set the
            //attribute to the top_pick_ item. The recommendation panel use the same xml file.
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_pick_items, parent, false);
            return new MyViewHolder(itemView,true);
        }
        else{
            //otherwise set it to detail_images.
            View itemView = LayoutInflater.from(mContext).inflate(R.layout.detail_images, parent, false);
            return new MyViewHolder(itemView,false);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       String imageName = new String();
       if(mainRecycler){
           //if it's recommendation panel or top pick panel.
           String name = itemsList.get(position).getProductText();
           String type = itemsList.get(position).getType();
           String price = itemsList.get(position).getPrice();
           String numberdigit =String.valueOf( itemsList.get(position).getDigit());
           imageName = type+"_item_"+numberdigit;
           int res = mContext.getResources().getIdentifier(imageName, "drawable",mContext.getPackageName());
           holder.image.setImageResource(res);//set the image of recycler view.
           holder.nameText.setText(name);//set the product name
           holder.priceText.setText(price);//set the product price.

           if(RandomItem){
               //if it's recommendation panel, set the background color to white.
               holder.cardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.white));
           }
       }
       else {//else it's detail image panel,then set the image source only.
           imageName = itemsList.get(position).getType()+"_item_"+itemsList.get(position).getDigit() +(position+1);
           int res = mContext.getResources().getIdentifier(imageName, "drawable",mContext.getPackageName());
           holder.image.setImageResource(res);

       }
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);

    }
}
