package com.ihutbd.ihutbd;

import android.support.v7.widget.RecyclerView;

public class Product {
    int ProductImage;
    String ProductName;
    String ProductFrom;
    String ProductRate;

    public Product(int productImage, String productName, String productFrom, String productRate) {
        ProductImage = productImage;
        ProductName = productName;
        ProductFrom = productFrom;
        ProductRate = productRate;
    }

    public Product() {
    }

    public int getProductImage() {
        return ProductImage;
    }

    public void setProductImage(int productImage) {
        ProductImage = productImage;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductFrom() {
        return ProductFrom;
    }

    public void setProductFrom(String productFrom) {
        ProductFrom = productFrom;
    }

    public String getProductRate() {
        return ProductRate;
    }

    public void setProductRate(String productRate) {
        ProductRate = productRate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductImage=" + ProductImage +
                ", ProductName='" + ProductName + '\'' +
                ", ProductFrom='" + ProductFrom + '\'' +
                ", ProductRate=" + ProductRate +
                '}';
    }
}

