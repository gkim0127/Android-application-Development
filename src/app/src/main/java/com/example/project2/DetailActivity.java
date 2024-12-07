package com.example.project2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//this class is for detail activity.
public class DetailActivity extends AppCompatActivity {

    private List<Product> itemsList,randomItems;
    private RecyclerView recyclerView,recyclerView2;
    private  recyclerAdaptor.RecyclerViewClickListener listener;
    private  int depth;
    private  TextView recommendView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //two recycler views are needed inside detail activity, the first one is to show the detail images
        // the second one is for recommendation. Find the view first.
        recyclerView = findViewById(R.id.recyclerView_detail);
        recyclerView2 = findViewById(R.id.recyclerView_detail2);
        itemsList = new ArrayList<>();

        Intent thisIntent = getIntent();

        //get the product information by getting the extra information from list activity.
        ArrayList<String> message = thisIntent.getStringArrayListExtra("MessagefromList");

        //Find those text views.
        TextView itemNameView = (TextView) findViewById(R.id.product_name_textView);
        TextView itemPriceView = (TextView) findViewById(R.id.product_price_textView);
        TextView itemDetailView = (TextView) findViewById(R.id.item_detail_textView);

        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        recommendView = (TextView) findViewById(R.id.item_recommend_textView);

        //depth is used to constrained the recommendation bar. It is not supposed to show after user already clicked
        //on a recommended product.
        depth = thisIntent.getIntExtra("depth",1);
        setProductInfo(message);
        setAdapter(depth);

        //set those text views.
        itemNameView.setText(message.get(2));
        itemPriceView.setText(message.get(4));
        itemDetailView.setText(message.get(6));

        String imageName = message.get(3);
        //show the category image.
        int res = this.getResources().getIdentifier(imageName, "drawable",this.getPackageName());
        categoryImage.setImageResource(res);

        ActionBar actionBar = getSupportActionBar();//enable and show the home button on menu bar.
        actionBar.setDisplayHomeAsUpEnabled(true);



    }
    //set adapter for both detail image recycler and recommendation recycler.
    private void setAdapter(int depth) {

        recyclerAdaptor adapter = new recyclerAdaptor(itemsList,this,false);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        LinearSnapHelper linearSnapHelper = new SnapHelperOneByOne();
        linearSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        if(depth <= 1) {//again, if user already clicked on a recommended product and goes to a detail activity,
            //the recommendation bar is not showing in the new detail activity.
            setOnClickListener();
            recyclerAdaptor adapter1 = new recyclerAdaptor(randomItems, this, true, listener,true);
            RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(
                    getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
            LinearSnapHelper linearSnapHelper1 = new SnapHelperOneByOne();
            linearSnapHelper1.attachToRecyclerView(recyclerView2);
            recyclerView2.setLayoutManager(layoutManager1);
            recyclerView2.setItemAnimator(new DefaultItemAnimator());
            recyclerView2.setAdapter(adapter1);
            recommendView.setText("Recommendation for you");
        }



    }

    //this method is to set up the recommended product list. and set up the detail image recycler view.
    private void setProductInfo(ArrayList<String> message) {
        randomItems = DataProvider.getRandomProducts(); //the product list are randomly generated.
        Product item = new Product(Integer.valueOf(message.get(0)),Integer.valueOf(message.get(1)),message.get(2),
                message.get(3),message.get(4),Integer.valueOf(message.get(5)),message.get(6));
        for(int i = 0 ;i <Integer.valueOf(message.get(5)); i++){
            //the recycler view of detail images depends on how many images that product contains.
            itemsList.add(item);
        }

    }


    //this onclickListener is used for recommendation bar, if user clicked on one recommended product,
    // the app will go to the detail activity of that product.
    private void setOnClickListener() {
        listener = new recyclerAdaptor.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent Detailintent = new Intent(getApplicationContext(),DetailActivity.class);
                ArrayList<String> input = new ArrayList<String>();

                input.add(String.valueOf(randomItems.get(position).getOrderDigit()));
                input.add(String.valueOf(randomItems.get(position).getDigit()));
                input.add(randomItems.get(position).getProductText());
                input.add(randomItems.get(position).getType());
                input.add(randomItems.get(position).getPrice());
                input.add(String.valueOf(randomItems.get(position).getNumberOfImgs()));
                input.add(randomItems.get(position).getDescription());

                //whenever we go to a detail activity, we need to put information of the specific
                // product into an string arraylist. And pass it to the extra. So we can get the product
                //information by getting the extra arraylist.

                Detailintent.putStringArrayListExtra("MessagefromList",input);
                Detailintent.putExtra("depth",depth+1);
                startActivity(Detailintent);
            }
        };
    }


}






