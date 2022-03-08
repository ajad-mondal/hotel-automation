package com.tw.hotelAutomation;

import java.util.ArrayList;
import java.util.List;

public class HotelAutomation {
    private final List<Floor> floors;

    private HotelAutomation(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        floors = new ArrayList<>();
        for (int i = 0; i < numberOfFloors; i++) {
            floors.add(new Floor(numberOfMainCorridors, numberOfSubCorridors));
        }
    }

    public static HotelAutomation createHotel(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        return new HotelAutomation(numberOfFloors, numberOfMainCorridors, numberOfSubCorridors);
    }

    public List<Floor> getFloors() {
        return this.floors;
    }
}
