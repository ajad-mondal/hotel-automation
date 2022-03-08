package com.tw.hotelAutomation;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private final List<MainCorridor> mainCorridors;
    private final List<SubCorridor> subCorridors;

    public Floor(int numberOfMainCorridors, int numberOfSubCorridors) {
        mainCorridors = new ArrayList<>();
        subCorridors = new ArrayList<>();
        for (int i = 0; i < numberOfMainCorridors; i++) {
            mainCorridors.add(new MainCorridor());
        }
        for (int i = 0; i < numberOfSubCorridors; i++) {
            subCorridors.add(new SubCorridor());
        }
    }

    public List<MainCorridor> getMainCorridors() {
        return this.mainCorridors;
    }

    public List<SubCorridor> getSubCorridors() {
        return this.subCorridors;
    }
}
