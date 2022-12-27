package com.example.imagepro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Description extends AppCompatActivity {

    TextView title;
    TextView description;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        title = findViewById(R.id.title);
        description = findViewById(R.id.desc);
        image = findViewById(R.id.Icon);
        Intent intent = getIntent();
        int i = intent.getIntExtra("maxPos", -1);
        int[] img = {R.drawable.watermelon, R.drawable.turnip, R.drawable.tomato, R.drawable.corn, R.drawable.spinach, R.drawable.raddish, R.drawable.potato, R.drawable.pomogranate, R.drawable.pineapple, R.drawable.peas, R.drawable.pear, R.drawable.orange, R.drawable.onion, R.drawable.mango, R.drawable.lettuce, R.drawable.lemon, R.drawable.kiwi, R.drawable.grapes, R.drawable.ginger, R.drawable.garlic, R.drawable.eggplant, R.drawable.cucumber, R.drawable.chilli, R.drawable.cauliflower, R.drawable.carrot, R.drawable.capsicum, R.drawable.cabbage, R.drawable.beetroot, R.drawable.banana, R.drawable.apple};
        String[] classes = {"watermelon", "turnip", "tomato", "corn", "spinach", "raddish", "potato", "pomegranate", "pineapple", "peas", "pear", "orange", "onion", "mango", "lettuce", "lemon", "kiwi", "grapes", "ginger", "garlic", "eggplant", "cucumber", "chilli", "cauliflower", "carrot", "capsicum", "cabbage", "beetroot", "banana", "apple"};
        String[] desc = {"Calories: 95\nFat: 0 grams\nProtein: 1 grams\nCarbohydrate: 25 grams\nSugar: 19 grams\nFiber: 3 grams",
                "Calories: 110\nFat: 0 grams\nProtein: 1 grams\nCarbohydrate: 28 grams\nSugar: 15 grams\nFiber: 3 grams\nPotassium: 450 mg"};
        title.setText(classes[i]);
        description.setText(desc[1]);
        image.setImageResource(img[i]);
    }

    @Override
    public void onBackPressed() {
        finishActivity(1);
        System.exit(0);
    }
}
