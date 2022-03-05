package com.moringaschool.myrestaurants;

//java class that will reference  Yelp credentials in our gradle.properties(WHERE OUR API KEY IS LOCATED)
public class Constants {
    public static final String YELP_BASE_URL ="https://api.yelp.com/v3/";
    public static final String YELP_API_KEY = BuildConfig.YELP_API_KEY;
}
