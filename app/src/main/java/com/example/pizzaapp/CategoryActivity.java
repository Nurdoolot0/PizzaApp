package com.example.pizzaapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CategoryAdapter adapter;
    private List<CategoryItem> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        categoryList = new ArrayList<>();
        categoryList.add(new CategoryItem("Burgers", R.drawable.burger_image));
        categoryList.add(new CategoryItem("Pizza", R.drawable.pizza_image));
        categoryList.add(new CategoryItem("Chicken", R.drawable.chicken_image));

        adapter = new CategoryAdapter(categoryList);
        recyclerView.setAdapter(adapter);
    }
}
