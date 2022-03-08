package com.tw.hotelAutomation;

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

    public void motionSensed(int floorNumber, int subCorridorNumber) {
        final int ONE_MINUTE = 60000;
        Floor floor = floors[floorNumber - 1];
        SubCorridor subCorridor = floor.getSubCorridors()[subCorridorNumber - 1];

        subCorridor.actOnMotion(ONE_MINUTE);
    }
}
