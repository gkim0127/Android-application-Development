package com.example.project2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;


// This class is for main activity.
public class MainActivity extends AppCompatActivity {

    private List<Product> itemsList;
    private RecyclerView recyclerView;
    private  recyclerAdaptor.RecyclerViewClickListener listener;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //set up for search bar
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override  //Whenever user submit a search query.The app goes to
            // list activity in a search mode. And with a extra value query.
            public boolean onQueryTextSubmit(String query) {

                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","search");
                ListIntent.putExtra("query",query);
                startActivity(ListIntent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return  super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set up for top pick panel.
        recyclerView = findViewById(R.id.recyclerView_main);
        setTopProduct();
        setAdapter();


        //if user clicked on new product card view. The app will go to the list activity in new product mode.
        //the mode is declared by putting a string extra.
        CardView NewProductsCardView = (CardView) findViewById(R.id.newproducts_view_items);
        NewProductsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","newproducts");

                startActivity(ListIntent);
            }
        });
        //if user clicked on deals card view. The app will go to the list activity in deals mode.
        //the mode is declared by putting a string extra.
        CardView DealsCardView = (CardView) findViewById(R.id.deals_view_items);
        DealsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","deals");

                startActivity(ListIntent);
            }
        });
        //if user clicked on bestselling card view. The app will go to the list activity in bestselling mode.
        //the mode is declared by putting a string extra.
        CardView BestSellingCardView = (CardView) findViewById(R.id.bestselling_view_items);
        BestSellingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","All Items");
                startActivity(ListIntent);
            }
        });


        //if user clicked on apple card view. The app will go to the list activity in apple mode.
        //the mode is declared by putting a string extra.
        CardView AppleCardView = (CardView) findViewById(R.id.apple_view_items);
        AppleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","apple");

                startActivity(ListIntent);
            }
        });
        //if user clicked on samsung card view. The app will go to the list activity in samsung mode.
        //the mode is declared by putting a string extra.
        CardView SamsungCardView = (CardView) findViewById(R.id.samsung_view_items);
        SamsungCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","samsung");
                startActivity(ListIntent);
            }
        });
        //if user clicked on microsoft card view. The app will go to the list activity in microsoft mode.
        //the mode is declared by putting a string extra.
        CardView MicrosoftCardView = (CardView) findViewById(R.id.microsoft_view_items);
        MicrosoftCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListIntent = new Intent(getBaseContext(), ListActivity.class);
                ListIntent.putExtra("MessagefromMain","microsoft");
                startActivity(ListIntent);
            }
        });
    }

    private void setAdapter() {
        //this method is for setting up the recycler adaptor for top pick panel.
        setOnClickListener();//set up onclickListener
        //initialise the adapter
        recyclerAdaptor adapter = new recyclerAdaptor(itemsList,this,true,listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL,false);
         //display the recycler view horizontally
        LinearSnapHelper linearSnapHelper = new SnapHelperOneByOne();//display one product at a time.
        linearSnapHelper.attachToRecyclerView(recyclerView);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        //this method is for setting up the click listener of top pick panel.
        //if user clicked on the top pick panel, it will go to the detail activity of that product.
        listener = new recyclerAdaptor.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                    Intent Detailintent = new Intent(getApplicationContext(),DetailActivity.class);
                    ArrayList<String> input = new ArrayList<String>();
                    input.add(String.valueOf(itemsList.get(position).getOrderDigit()));
                    input.add(String.valueOf(itemsList.get(position).getDigit()));
                    input.add(itemsList.get(position).getProductText());
                    input.add(itemsList.get(position).getType());
                    input.add(itemsList.get(position).getPrice());
                    input.add(String.valueOf(itemsList.get(position).getNumberOfImgs()));
                    input.add(itemsList.get(position).getDescription());
                    //whenever we go to a detail activity, we need to put information of the specific
                // product into an string arraylist. And pass it to the extra. So we can get the product
                //information by getting the extra arraylist.
                    Detailintent.putStringArrayListExtra("MessagefromList",input);
                startActivity(Detailintent);
            }
        };
    }


    // This method is to store the top product information in an instance.
    private void setTopProduct() {
        itemsList = DataProvider.getProducts("topproducts");
    }
}