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

        hotel.automate();
    }

}
