package com.tw.hotelAutomation;

import java.util.ArrayList;
import java.util.List;

public class HotelAutomation {
    private final Floor[] floors;

    private HotelAutomation(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        floors = new Floor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new Floor(numberOfMainCorridors, numberOfSubCorridors);
        }
    }

    public static HotelAutomation createHotel(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        return new HotelAutomation(numberOfFloors, numberOfMainCorridors, numberOfSubCorridors);
    }

    public Floor[] getFloors() {
        return this.floors;
    }
}
