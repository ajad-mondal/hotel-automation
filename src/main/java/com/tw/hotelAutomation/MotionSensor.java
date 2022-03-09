package com.tw.hotelAutomation;

import java.util.Scanner;

public class MotionSensor {
    private final int numberOfSubCorridors;
    private final int numberOfFloors;
    Scanner scanner;

    public MotionSensor(int numberOfFloors, int numberOfSubCorridors) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfSubCorridors = numberOfSubCorridors;
        scanner = new Scanner(System.in);
    }

    public int[] nextMotion() {
        int floorNumber = nextFloor();
        int subCorridorNumber = nextSubCorridor();

        return new int[]{floorNumber, subCorridorNumber};
    }

    private int nextFloor() {
        int floorNumber;
        System.out.println("Enter Floor number in which motion is detected : ");
        floorNumber = scanner.nextInt();
        if (isNotValid(floorNumber, numberOfFloors)) {
            System.out.println("There are " + numberOfFloors + " floors in the hotel.");
            floorNumber = nextFloor();
        }
        return floorNumber;
    }

    private int nextSubCorridor() {
        int subCorridorNumber;
        System.out.println("Enter Sub corridor number in which motion is detected : ");
        subCorridorNumber = scanner.nextInt();
        if (isNotValid(subCorridorNumber, numberOfSubCorridors)) {
            System.out.println("There are " + numberOfSubCorridors + " sub corridors in the floor.");
            subCorridorNumber = nextSubCorridor();
        }
        return subCorridorNumber;
    }

    private boolean isNotValid(int inputValue, int rangeOfValue) {
        return !(inputValue <= rangeOfValue) && (inputValue >= 1);
    }
}
