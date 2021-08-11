package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_category);
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Food.foods);
        ListView listf = (ListView) findViewById(R.id.list_foods);
        listf.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listDrinks, View itemView, int position, long id)
            {
                Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
                intent.putExtra(FoodActivity.EXTRA_FOODID, (int) id);
                startActivity(intent);
            }
        };
        listf.setOnItemClickListener(itemClickListener);
    }
}
