
package com.moringaschool.myrestaurants;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business {
    //in this class we have 14 instance variable!
    @SerializedName("rating")
    @Expose
    private int rating;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("is_closed")
    @Expose
    private boolean isClosed;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("review_count")
    @Expose
    private int reviewCount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("coordinates")
    @Expose
    private Coordinates coordinates;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("distance")
    @Expose
    private double distance;
    @SerializedName("transactions")
    @Expose
    private List<String> transactions = null;


   //constructors
    public Business(int rating, String price, String phone, String id, String alias, boolean isClosed, List<Category> categories, int reviewCount, String name, String url, Coordinates coordinates, String imageUrl, Location location, double distance, List<String> transactions) {
        super();
        this.rating = rating;
        this.price = price;
        this.phone = phone;
        this.id = id;
        this.alias = alias;
        this.isClosed = isClosed;
        this.categories = categories;
        this.reviewCount = reviewCount;
        this.name = name;
        this.url = url;
        this.coordinates = coordinates;
        this.imageUrl = imageUrl;
        this.location = location;
        this.distance = distance;
        this.transactions = transactions;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Business withRating(int rating) {
        this.rating = rating;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Business withPrice(String price) {
        this.price = price;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Business withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Business withId(String id) {
        this.id = id;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Business withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public boolean isIsClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Business withIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Business withCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Business withReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Business withName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Business withUrl(String url) {
        this.url = url;
        return this;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Business withCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Business withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Business withLocation(Location location) {
        this.location = location;
        return this;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Business withDistance(double distance) {
        this.distance = distance;
        return this;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public Business withTransactions(List<String> transactions) {
        this.transactions = transactions;
        return this;
    }

}
