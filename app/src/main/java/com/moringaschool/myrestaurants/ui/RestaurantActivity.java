package com.moringaschool.myrestaurants;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

public class RestaurantActivity extends AppCompatActivity {



    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;

    //our array
    private String[] restaurants = new String[] {"Sweet Hereafter", "Cricket", "Hawthorne Fish House", "Viking Soul Food",
            "Red Square", "Horse Brass", "Dick's Kitchen",
            "Taco Bell", "Me Kha Noodle Bar", "La Bonita Taqueria", "Smokehouse Tavern", "Pembiche", "Kay's Bar", "Gnarly Grey", "Slappy Cakes", "Mi Mero Mole" };
    private String[] cuisines = new String[] {"Vegan Food", "Breakfast", "Fishs Dishs", "Scandinavian", "Coffee", "English Food",
            "Burgers", "Fast Food", "Noodle Soups",
            "Mexican", "BBQ", "Cuban", "Bar Food", "Sports Bar", "Breakfast", "Mexican" };

    public static final String TAG = RestaurantActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ButterKnife.bind(this);


        myRestaurantsArrayAdapter adapter = new myRestaurantsArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants, cuisines);
        mListView.setAdapter(adapter);

        Intent intent = getIntent();
        /** recreates the Intent that has just taken us to this new activity.*/
        String location = intent.getStringExtra("location");
        /** getStringExtra(): Called upon an Intent that has additional data attached to it. If provided an argument representing the string key in
         the key-value pair described above, it will return the value*/
        mLocationTextView.setText("Here are all the restaurants near: " + location);

        Log.d(TAG, "worked here lol!");





    }
}