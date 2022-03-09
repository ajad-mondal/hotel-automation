package com.tw.hotelAutomation;

public class HotelAutomation {
    private final Floor[] floors;
    private boolean automationRunning;
    private final MotionSensor sensor;

    private HotelAutomation(int numberOfFloors, int numberOfMainCorridors, int numberOfSubCorridors) {
        floors = new Floor[numberOfFloors];
        sensor = new MotionSensor(numberOfFloors, numberOfSubCorridors);
        automationRunning = false;
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

    public void automate() {
        automationRunning = true;

        System.out.println("Automation Started.");
        while(automationRunning){
            displayRecord();

            int[] sensorInputs = sensor.nextMotion();
            int floorNumber = sensorInputs[0];
            int subCorridorNumber = sensorInputs[1];

            motionSensed(floorNumber, subCorridorNumber);
        }

        System.out.println("Automation Terminated.");
    }

    private void motionSensed(int floorNumber, int subCorridorNumber) {
        final int ONE_MINUTE = 60000;
        Floor floor = floors[floorNumber - 1];
        SubCorridor subCorridor = floor.getSubCorridors()[subCorridorNumber - 1];

        subCorridor.actOnMotion(ONE_MINUTE);
    }

    private void displayRecord() {
        System.out.println("__________________________________________");
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

            for (SubCorridor subCorridor :
                    subCorridors) {
                System.out.println("Sub Corridor " + subCorridorCounter++
                        + " | Light : " + subCorridor.getLightSwitch()
                        + " | AC : " + subCorridor.getAcSwitch());
            }
            System.out.println("........................................");
        }
    }
}
