package com.tw.hotelAutomation;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private final List<MainCorridor> mainCorridors;

    public Floor(int numberOfMainCorridors, int numberOfSubCorridors) {
        mainCorridors = new ArrayList<>();
        for (int i = 0; i < numberOfMainCorridors; i++) {
            mainCorridors.add(new MainCorridor());
        }
    }

    public List<MainCorridor> getMainCorridors() {
        return this.mainCorridors;
    }
}
