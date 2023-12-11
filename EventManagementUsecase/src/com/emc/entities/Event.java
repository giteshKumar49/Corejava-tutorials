package com.emc.entities;

import java.util.Date;

public class Event {
    private long eventId;
    private String eventName;
    private String eventDescription;
    private Date eventStartTime;
    private Date eventEndTime;
    private boolean isEventStarted;

    public Event(long eventId, String eventName,
                 String eventDescription,
                 Date eventStartTime,
                 Date eventEndTime,
                 boolean isEventStarted) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.isEventStarted = isEventStarted;
    }

    public long getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public Date getEventStartTime() {
        return eventStartTime;
    }

    public Date getEventEndTime() {
        return eventEndTime;
    }

    public boolean isEventStarted() {
        return isEventStarted;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setEventStartTime(Date eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public void setEventEndTime(Date eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public void setEventStarted(boolean eventStarted) {
        isEventStarted = eventStarted;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventStartTime=" + eventStartTime +
                ", eventEndTime=" + eventEndTime +
                ", isEventStarted=" + isEventStarted +
                '}';
    }
}
