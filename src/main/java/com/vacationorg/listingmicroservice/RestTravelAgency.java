package com.vacationorg.listingmicroservice;

import java.util.*;

public class RestTravelAgency {

    private int agencyID;
    private String name;
    private ArrayList<RestListing> listings;

    public RestTravelAgency(int agencyID, String name, ArrayList<RestListing> listings) {
        this.agencyID = agencyID;
        this.name = name;
        this.listings = listings;
    }

    public int getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(int agencyID) {
        this.agencyID = agencyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RestListing> getRestListings() {
        return listings;
    }

    public void setRestListings(ArrayList<RestListing> listings) {
        this.listings = listings;
    }

    public ArrayList<RestListing> getAllRestListings() {
        return listings;
    }
}
