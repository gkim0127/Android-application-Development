package com.example.project2;

//this class is for the product object. 7 instances are needed to initialise a product object.
// digit and order digit are kinda similar,those are used to show the order of the product inside a list.
// number of images are used to show how many detail images are used for the product.
//productText is the product name, description is used to put in the detail activity.

public class Product {
    int digit,numberOfImgs,orderDigit;
    String  productText,type,price,description;


    public int getDigit(){
        return digit;
    }

    public String getProductText() {
        return productText;
    }

    public String getType() {return type;}

    public String getPrice() {
        return price;
    }

    public int getNumberOfImgs() {
        return numberOfImgs;
    }

    public int getOrderDigit() {
        return orderDigit;
    }

    public String getDescription() {
        return description;
    }

    public void setOrderDigit(int orderDigit) {
        this.orderDigit = orderDigit;
    }



    public Product(int orderDigit, int digit, String productText,
                   String type, String price, int numberOfImgs,String description){
        this.orderDigit = orderDigit;
        this.digit=digit;
        this.productText=productText;
        this.type = type;
        this.price=price;
        this.numberOfImgs = numberOfImgs;
        this.description = description;

    }
}
