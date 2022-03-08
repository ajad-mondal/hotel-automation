package com.tw.hotelAutomation;

import org.junit.jupiter.api.Test;

import static com.tw.hotelAutomation.HotelAutomation.createHotel;
import static com.tw.hotelAutomation.SwitchStatus.OFF;
import static com.tw.hotelAutomation.SwitchStatus.ON;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HotelAutomationTest {
    @Test
    void shouldSwitchOnLightOfMainCorridorAllTime() {
        HotelAutomation hotel = createHotel(1, 1, 1);
        Floor[] floors = hotel.getFloors();
        Floor floor = floors[0];
        MainCorridor[] mainCorridors = floor.getMainCorridors();
        MainCorridor mainCorridor = mainCorridors[0];

        SwitchStatus lightStatus = mainCorridor.getLightSwitch();

        assertThat(lightStatus, is(equalTo(ON)));
    }

    @Test
    void shouldSwitchOnACOfMainCorridorAllTime() {
        HotelAutomation hotel = createHotel(1, 1, 1);
        Floor[] floors = hotel.getFloors();
        Floor floor = floors[0];
        MainCorridor[] mainCorridors = floor.getMainCorridors();
        MainCorridor mainCorridor = mainCorridors[0];

        SwitchStatus ACStatus = mainCorridor.getAcSwitch();

        assertThat(ACStatus, is(equalTo(ON)));
    }

    @Test
    void shouldSwitchOffLightInSubCorridorsWhenAutomationRunAtFirst() {
        HotelAutomation hotel = createHotel(1, 1, 1);
        Floor[] floors = hotel.getFloors();
        Floor floor = floors[0];
        SubCorridor[] subCorridors = floor.getSubCorridors();
        SubCorridor subCorridor = subCorridors[0];

        SwitchStatus lightSwitch = subCorridor.getLightSwitch();

        assertThat(lightSwitch, is(OFF));
    }

    @Test
    void shouldSwitchOnAcInSubCorridorsWhenAutomationRunAtFirst() {
        HotelAutomation hotel = createHotel(1, 1, 1);
        Floor[] floors = hotel.getFloors();
        Floor floor = floors[0];
        SubCorridor[] subCorridors = floor.getSubCorridors();
        SubCorridor subCorridor = subCorridors[0];

        SwitchStatus acSwitch = subCorridor.getAcSwitch();

        assertThat(acSwitch, is(ON));
    }
}
