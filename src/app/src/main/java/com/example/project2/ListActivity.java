package com.example.project2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;


//this class is for list activity.
public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent thisIntent = getIntent();

        //get mode information by getting the string extra from main activity.
        String message = thisIntent.getStringExtra("MessagefromMain");
        List<Product> productsList = DataProvider.getProducts(message);//initialise the product list.

        //if its search mode. it will put the search query into a method to search items and list them.
        if (message.equals("search")){
            String query = thisIntent.getStringExtra("query");
            String resultProductNumber = new String();

            productsList = searchItem(productsList,query);//put the product list and query into the method.
            resultProductNumber ="There are " +String.valueOf(productsList.size()) + " result(s)";
            Toast.makeText(this, resultProductNumber,Toast.LENGTH_LONG).show();
            message = message + " for： " + query + "       result(s):  "+productsList.size();
        }

        //initialise the list view adapter. And set adapter.
        ProductAdaptor itemsAdapter = new ProductAdaptor(this,
                R.layout.product_list_view_item,productsList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  //set up the home button.

        actionBar.setTitle(message);

    }

    //this method is for searching a string inside a product list. And return a new product list that
    //matches the string. Two inputs are needed. The first one is the product list, the second one is
    // the query string.
    private List<Product> searchItem(List<Product> productsList, String query) {
        //initialise a new product list.
        List<Product> ouputList = new ArrayList<>();
        int orderDigit = 1;
        //search every product inside the product list that if it contains the query string.
        //if yes, then save the product into the output product list.
        for(int i = 0; i <productsList.size(); i++ ){
            boolean output = productsList.get(i).
                    getProductText().toLowerCase(Locale.ROOT).contains(query);
            if(output){
                productsList.get(i).setOrderDigit(orderDigit);
                orderDigit++;
                ouputList.add(productsList.get(i));
            }
        }
        return ouputList;
    }
}