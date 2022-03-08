package com.tw.hotelAutomation;

public class Floor {
    private final MainCorridor[] mainCorridors;
    private final SubCorridor[] subCorridors;

    public Floor(int numberOfMainCorridors, int numberOfSubCorridors) {
        mainCorridors = new MainCorridor[numberOfMainCorridors];
        subCorridors = new SubCorridor[numberOfSubCorridors];
        for (int i = 0; i < numberOfMainCorridors; i++) {
            mainCorridors[i] = new MainCorridor();
        }
        for (int i = 0; i < numberOfSubCorridors; i++) {
            subCorridors[i] = new SubCorridor();
        }
    }

    public MainCorridor[] getMainCorridors() {
        return this.mainCorridors;
    }

    public SubCorridor[] getSubCorridors() {
        return this.subCorridors;
    }
}
