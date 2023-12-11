package com.emc.entities;

public class Participant {
    private long participantId;
    private String participantName;
    private String participantEmail;
    private boolean isParticipantCheckedIn;

    public Participant(long participantId,
                       String participantName,
                       String participantEmail,
                       boolean isParticipantCheckedIn) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.participantEmail = participantEmail;
        this.isParticipantCheckedIn = isParticipantCheckedIn;
    }

    public void setParticipantId(long participantId) {
        this.participantId = participantId;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public void setParticipantCheckedIn(boolean participantCheckedIn) {
        isParticipantCheckedIn = participantCheckedIn;
    }

    public long getParticipantId() {
        return participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public boolean isParticipantCheckedIn() {
        return isParticipantCheckedIn;
    }
}
