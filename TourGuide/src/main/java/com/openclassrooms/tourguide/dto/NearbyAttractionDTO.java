package com.openclassrooms.tourguide.dto;

public class NearbyAttractionDTO {
    private String attractionName;
    private double attractionLat;
    private double attractionLng;
    private double userLat;
    private double userLng;
    private double distanceInMiles;
    private int rewardPoints;

    public NearbyAttractionDTO(String attractionName, double attractionLat, double attractionLng, double userLat, double userLng, double distanceInMiles, int rewardPoints) {
        this.attractionName = attractionName;
        this.attractionLat = attractionLat;
        this.attractionLng = attractionLng;
        this.userLat = userLat;
        this.userLng = userLng;
        this.distanceInMiles = distanceInMiles;
        this.rewardPoints = rewardPoints;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public double getAttractionLat() {
        return attractionLat;
    }

    public double getAttractionLng() {
        return attractionLng;
    }

    public double getUserLat() {
        return userLat;
    }

    public double getUserLng() {
        return userLng;
    }

    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}
