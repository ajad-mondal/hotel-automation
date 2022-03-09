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

    public int[] nextInput() {
        int floorNumber;
        int subCorridorNumber;
        while (true) {
            System.out.println("Enter Floor number in which motion is detected : ");
            floorNumber = scanner.nextInt();
            if (isValid(floorNumber, numberOfFloors)) {
                while (true) {
                    System.out.println("Enter Sub corridor number in which motion is detected : ");
                    subCorridorNumber = scanner.nextInt();
                    if (!isValid(subCorridorNumber, numberOfSubCorridors)) {
                        System.out.println("There are " + numberOfSubCorridors + " sub corridors in the floor.");
                        continue;
                    }
                    break;
                }
            } else {
                System.out.println("There are " + numberOfFloors + " floors in the hotel.");
                continue;
            }
            break;
        }
        return new int[]{floorNumber, subCorridorNumber};
    }

    private boolean isValid(int inputValue, int rangeOfValue) {
        return (inputValue <= rangeOfValue) && (inputValue >= 1);
    }
}
