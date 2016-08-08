package com.sameen;

/**
 * Created by sameenislam on 08/08/2016.
 */
public class Room {

    private int roomNumber;
    private int qualityLevel;
    private int noOfAdjoiningRooms;
    private boolean smoking; // false if non-smoking
    private boolean isReserved;
    private String bedConfiguration;

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getQualityLevel() {
        return qualityLevel;
    }

    public int getNoOfAdjoiningRooms() {
        return noOfAdjoiningRooms;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public String getBedConfiguration() {
        return bedConfiguration;
    }




}
