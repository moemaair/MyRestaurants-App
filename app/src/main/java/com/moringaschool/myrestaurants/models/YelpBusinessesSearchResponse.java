
package com.moringaschool.myrestaurants;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YelpBusinessesSearchResponse {

    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("businesses")
    @Expose
    private List<Business> businesses = null;
    @SerializedName("region")
    @Expose
    private Region region;


    public YelpBusinessesSearchResponse(int total, List<Business> businesses, Region region) {
        super();
        this.total = total;
        this.businesses = businesses;
        this.region = region;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public YelpBusinessesSearchResponse withTotal(int total) {
        this.total = total;
        return this;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public YelpBusinessesSearchResponse withBusinesses(List<Business> businesses) {
        this.businesses = businesses;
        return this;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public YelpBusinessesSearchResponse withRegion(Region region) {
        this.region = region;
        return this;
    }

}
