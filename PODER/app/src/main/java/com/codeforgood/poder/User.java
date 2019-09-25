package com.codeforgood.poder;

public class User {
    private String email;
    private String name;
    private int phoneNumber;
    private int registrationTestScore;
    private String address;

    //Demographic information
    private int howDidYouHearAboutUs;
    private String referral;
    private boolean[] workPreference;
    private boolean[] locationPreference;
    private boolean timePreference;
    private boolean[] meansOfTransportation;

    private Status userStatus;

    public enum Status {
        NEW,
        REGISTERED,
        ENROLLED,
        DROPPEED;
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
        this.userStatus = Status.NEW;

    }

    public Status getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Status userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRegistrationTestScore() {
        return registrationTestScore;
    }

    public void setRegistrationTestScore(int registrationTestScore) {
        this.registrationTestScore = registrationTestScore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHowDidYouHearAboutUs() {
        return howDidYouHearAboutUs;
    }

    public void setHowDidYouHearAboutUs(int howDidYouHearAboutUs) {
        this.howDidYouHearAboutUs = howDidYouHearAboutUs;
    }

    public boolean[] getWorkPreference() {
        return workPreference;
    }

    public void setWorkPreference(boolean[] workPreference) {
        this.workPreference = workPreference;
    }

    public boolean[] getLocationPreference() {
        return locationPreference;
    }

    public void setLocationPreference(boolean[] locationPreference) {
        this.locationPreference = locationPreference;
    }

    public boolean isTimePreference() {
        return timePreference;
    }

    public void setTimePreference(boolean timePreference) {
        this.timePreference = timePreference;
    }

    public boolean[] getMeansOfTransportation() {
        return meansOfTransportation;
    }

    public void setMeansOfTransportation(boolean[] meansOfTransportation) {
        this.meansOfTransportation = meansOfTransportation;
    }
}
