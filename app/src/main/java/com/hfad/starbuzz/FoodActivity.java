package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODID = "foodID";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

            int foodID = (Integer) getIntent().getExtras().get(EXTRA_FOODID);
            Food food = Food.foods[foodID];

            TextView name = (TextView) findViewById(R.id.name);
            name.setText(food.getName());

            TextView description = (TextView) findViewById(R.id.description);
            description.setText(food.getDescription());

            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(food.getImageResourceID());
            photo.setContentDescription(food.getName());
        }
    }

