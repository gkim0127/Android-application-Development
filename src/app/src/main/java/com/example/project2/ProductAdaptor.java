package com.example.project2;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.List;

//this class is for displaying the list of products in the list activity.
public class ProductAdaptor extends ArrayAdapter {

    int mLayoutID;
    List<Product> mProducts;
    Context mContext;


    public ProductAdaptor(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mLayoutID = resource;
        mContext = context;
        mProducts = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get a reference to the current ListView item
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }


        //Get the product object for the current position
        Product currentProduct = mProducts.get(position);

        //Set the attributed of text views.
        TextView productDigitView = (TextView) currentListViewItem.findViewById(R.id.product_digit_view);
        productDigitView.setText(String.valueOf(currentProduct.getOrderDigit()));

        TextView productTextView = (TextView) currentListViewItem.findViewById(R.id.product_text_view);
        productTextView.setText(currentProduct.getProductText());

        TextView productPriceView = (TextView) currentListViewItem.findViewById(R.id.product_price_view);

        productPriceView.setText(currentProduct.getPrice());
        productPriceView.setTextSize(TypedValue.COMPLEX_UNIT_PX,getContext().getResources().getDimension(R.dimen.textsize2));
        if(currentProduct.getType().equals("deals")){  //if the category is deals, the price is longer, so
                                                       //the text size of price will be smaller.
            productPriceView.setTextSize(TypedValue.COMPLEX_UNIT_PX,getContext().getResources().getDimension(R.dimen.textsize1));
        }

        String imageName = currentProduct.getType()+"_item_"+currentProduct.getDigit();
        int res = getContext().getResources().getIdentifier(imageName, "drawable", getContext().getPackageName());
        final ImageView play = (ImageView) currentListViewItem.findViewById(R.id.product_image_view);
        play.setImageResource(res);//set the image view to the specific product image.

        final CardView item= (CardView)currentListViewItem.findViewById(R.id.item_card_view);
        //Setting the card view  click handler
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> input = new ArrayList<String>();
                input.add(String.valueOf(currentProduct.getOrderDigit()));
                input.add(String.valueOf(currentProduct.getDigit()));
                input.add(currentProduct.getProductText());
                input.add(currentProduct.getType());
                input.add(currentProduct.getPrice());
                input.add(String.valueOf(currentProduct.getNumberOfImgs()));
                input.add(currentProduct.getDescription());

                //whenever we go to a detail activity, we need to put information of the specific
                // product into an string arraylist. And pass it to the extra. So we can get the product
                //information by getting the extra arraylist.
                Intent DetailIntent = new Intent(mContext, DetailActivity.class);
                DetailIntent.putStringArrayListExtra("MessagefromList",input);
                mContext.startActivity(DetailIntent);


            }
        });

        return currentListViewItem;
    }
}

