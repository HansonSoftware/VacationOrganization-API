package com.vacationorg.listingmicroservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestListingController {

	@GetMapping("/getActiveListing/{propertyID}")
	public RestListing getActiveListing(@PathVariable("propertyID") int propertyID) {
		RestTravelAgency agency = getActiveListings();

		// Returns a JSON object of the Java object requested
		return agency.getRestListings().get(propertyID);
	}

	// This is my mock database, it is essentially doing what that tiny H2
	// was anyway. I really just needed an array.
	public RestTravelAgency getActiveListings() {

		// Mock Database of 6 Property Listings
		ArrayList<RestListing> listings = new ArrayList<>();

		RestLocation location0 = new RestLocation("123 Main St", "New York", "NY", "10001");
		RestLocation location1 = new RestLocation("456 Elm St", "San Francisco", "CA", "94101");
		RestLocation location2 = new RestLocation("789 Oak St", "Los Angeles", "CA", "90001");
		RestLocation location3 = new RestLocation("321 Pine St", "Virginia Beach", "VA", "23451");
		RestLocation location4 = new RestLocation("654 Maple St", "Las Vegas", "NV", "89101");
		RestLocation location5 = new RestLocation("987 Cedar St", "Canada", "CA", "A1A 1A1");

		RestListing listing0 = new RestListing(0, "Beautiful House", 150, location0);
		RestListing listing1 = new RestListing(1, "Cozy Apartment", 100, location1);
		RestListing listing2 = new RestListing(2, "Spacious Villa", 300, location2);
		RestListing listing3 = new RestListing(3, "Brand New House", 200, location3);
		RestListing listing4 = new RestListing(4, "New Apartment", 120, location4);
		RestListing listing5 = new RestListing(5, "Stunning Villa", 400, location5);

		listings.add(listing0);
		listings.add(listing1);
		listings.add(listing2);
		listings.add(listing3);
		listings.add(listing4);
		listings.add(listing5);

		// Create Travel Agency
		RestTravelAgency agency = new RestTravelAgency(1, "Rent Homez Quick", listings);

		return agency;
	}
}
