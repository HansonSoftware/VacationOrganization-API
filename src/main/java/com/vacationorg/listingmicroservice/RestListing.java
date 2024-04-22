package com.vacationorg.listingmicroservice;

public class RestListing {

    // Object Looks like this:
    /*
     * {
     * "PropertyID": "1",
     * "name": "..",
     * "street": "..",
     * "city": "..",
     * "state": "..",
     * "zipcode": ".."
     * }
     */

    private int propertyID;
    private String name;
    private int cost;
    private RestLocation location;

    public RestListing(int propertyID, String name, int cost, RestLocation location) {
        this.propertyID = propertyID;
        this.name = name;
        this.cost = cost;
        this.location = location;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public RestLocation getLocation() {
        return location;
    }

    public void setLocation(RestLocation location) {
        this.location = location;
    }
}
