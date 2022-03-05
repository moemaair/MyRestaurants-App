package com.moringaschool.myrestaurants;


import static org.junit.Assert.assertTrue;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import com.moringaschool.myrestaurants.ui.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
@Config(sdk = {Build.VERSION_CODES.O_MR1})
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    //configuration
    @Before
    public void setUp()throws Exception{
         activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }
    //to validate if the text of textView is the correct one
    @Test
    public void validatetextViewToTrue(){
        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
        assertTrue("MyRestaurants".equals(appNameTextView.getText().toString()));
    }


    @Test
    public void secondActivityStarted(){
        activity.findViewById(R.id.findRestaurantsButton).performClick();
        Intent expectedIntent = new Intent(activity, RestrauntActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
    /**Shadows are Classes that modify or extend the behavior of a class in the Android SDK.
     * Robolectric looks for Shadow classes that
     correspond with any Android classes that are run as part of a Robolectric test.*/

}
