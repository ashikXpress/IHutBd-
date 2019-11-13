package com.ihutbd.ihutbd;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Product> productList;

    public ProductAdapter(Context context, ArrayList<Product> productList){
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.product_card_row, null, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.imageView.setImageResource(productList.get(i).ProductImage);
        myViewHolder.productName.setText(productList.get(i).ProductName);
        myViewHolder.productFrom.setText(productList.get(i).ProductFrom);
        myViewHolder.productRate.setText(productList.get(i).ProductRate);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView productName, productFrom, productRate;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
            productFrom = itemView.findViewById(R.id.productFrom);
            productRate = itemView.findViewById(R.id.productPrice);
        }
    }
}
