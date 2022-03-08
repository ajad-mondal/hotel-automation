package com.tw.hotelAutomation;

import java.util.Scanner;

import static com.tw.hotelAutomation.HotelAutomation.createHotel;

public class AutomationApp {
    public static void main(String[] args) {
        System.out.println("Starting Automation...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Number of Floors in the Hotel:");
        int numberOfFloors = scanner.nextInt();
        System.out.println("Please Enter Number of Main Corridors in a floor:");
        int numberOfMainCorridors = scanner.nextInt();
        System.out.println("Please Enter Number of sub-corridors in a floor:");
        int numberOfSubCorridors = scanner.nextInt();
        HotelAutomation hotel = createHotel(numberOfFloors, numberOfMainCorridors, numberOfSubCorridors);
        System.out.println("Automation Started.");

        automate(hotel);

        System.out.println("Automation Terminated.");
    }

    private static void automate(HotelAutomation hotel) {
        while(true){
            displayAutomationStatus(hotel);
            System.out.println("Enter Sensing Input");
            getSensorInput(hotel);
        }

    }

    private static void getSensorInput(HotelAutomation hotel) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = hotel.getFloors().length;
        int numberOfSubCorridors = hotel.getFloors()[0].getSubCorridors().length;
        while(true){
            System.out.println("Enter Floor number in which motion is detected : ");
            int floorNumber = scanner.nextInt();
            if(floorNumber <= numberOfFloors && floorNumber >= 1){
                while(true){
                    System.out.println("Enter Sub corridor number in which motion is detected : ");
                    int subCorridorNumber = scanner.nextInt();
                    if(subCorridorNumber <= numberOfSubCorridors && subCorridorNumber >= 1){
                        hotel.motionSensed(floorNumber, subCorridorNumber);
                    }else{
                        System.out.println("There are " + numberOfSubCorridors + " sub corridors in the floor.");
                        continue;
                    }
                    break;
                }

            }else{
                System.out.println("There are " + numberOfFloors + " floors in the hotel.");
                continue;
            }

            break;
        }
    }

    private static void displayAutomationStatus(HotelAutomation hotel) {
        System.out.println("__________________________________________");
        Floor[] floors = hotel.getFloors();
        int floorCounter = 1;
        for (Floor floor : floors) {
            int mainCorridorCounter = 1;
            int subCorridorCounter = 1;
            System.out.println("Floor " + floorCounter++);
            MainCorridor[] mainCorridors = floor.getMainCorridors();
            SubCorridor[] subCorridors = floor.getSubCorridors();

            for (MainCorridor mainCorridor :
                    mainCorridors) {
                System.out.println("Main Corridor " + mainCorridorCounter++
                        + " | Light : " + mainCorridor.getLightSwitch()
                        + " | AC : " + mainCorridor.getAcSwitch());
            }

            for (SubCorridor subCorridor:
                    subCorridors) {
                System.out.println("Sub Corridor " + subCorridorCounter++
                        + " | Light : " + subCorridor.getLightSwitch()
                        + " | AC : " + subCorridor.getAcSwitch());
            }
            System.out.println("........................................");
        }
    }
}
