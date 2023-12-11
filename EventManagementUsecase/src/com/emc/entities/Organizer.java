package com.emc.entities;

public class Organizer {
    private long organizerId;
    private String organizerName;

    public Organizer(long organizerId, String organizerName) {
        this.organizerId = organizerId;
        this.organizerName = organizerName;
    }

    public void setOrganizerId(long organizerId) {
        this.organizerId = organizerId;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public long getOrganizerId() {
        return organizerId;
    }

    public String getOrganizerName() {
        return organizerName;
    }
}
