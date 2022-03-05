package com.moringaschool.myrestaurants;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindRestaurantsButton.setOnClickListener(this);
    }
    //implementing what we set in line 34 as our base for making click posssible.
    @Override
    public void onClick(View v) {
        //for clicking the "findRestaurantButton in mainActivity"
        if(v == mFindRestaurantsButton){
            Toast.makeText(MainActivity.this, "welcome!", Toast.LENGTH_LONG).show();
            String location = mLocationEditText.getText().toString(); //saving what we wrote in editText widget
            Intent i = new Intent(MainActivity.this, RestaurantActivity.class); //sending the data to second argument(RestaurantActivity.class)
            i.putExtra("location", location); //making the saved variable available in form of key-value using putExtra method
            startActivity(i); // action happening!! like a movie 😂
        }


    }
}



