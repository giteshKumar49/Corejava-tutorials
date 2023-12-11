package com.emc.entities;

public class Venue extends Address {
    private long venueId;
    private String venueName;
    private String venueDescription;

    public Venue(String streetAddress,
                 String city,
                 String state,
                 String country,
                 String pincode,
                 long venueId,
                 String venueName,
                 String venueDescription) {
        super(streetAddress, city, state, country, pincode);
        this.venueId = venueId;
        this.venueName = venueName;
        this.venueDescription = venueDescription;
    }

    public void setVenueId(long venueId) {
        this.venueId = venueId;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public void setVenueDescription(String venueDescription) {
        this.venueDescription = venueDescription;
    }

    public long getVenueId() {
        return venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getVenueDescription() {
        return venueDescription;
    }
}
