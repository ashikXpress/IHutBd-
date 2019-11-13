package com.ihutbd.ihutbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product( R.drawable.nido2_5, "Nedo 2.5kg", "Dubai",
                "2350"));
        products.add(new Product(R.drawable.nido_packet, "Nedo 2.25kg", "Dubai", "1900"));
        products.add(new Product(R.drawable.lactogrow_3, "Lactogrow 1.85kg", "Malaysia", "2100"));
        products.add(new Product(R.drawable.lactogrow_packet, "Lactogrow 1.3kg", "Malaysia", "1300"));
        products.add(new Product(R.drawable.cerelac_mixed_fruits, "Cerelac 800gm", "South Africa", "1100"));
        products.add(new Product(R.drawable.kitkat_two_finger, "Kitkat 2 finger", "Dubai", "1150"));

        ProductAdapter productAdapter = new ProductAdapter(MainActivity.this, products);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setAdapter(productAdapter);


    }
}
