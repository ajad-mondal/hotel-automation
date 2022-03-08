package com.tw.hotelAutomation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.tw.hotelAutomation.HotelAutomation.createHotel;
import static com.tw.hotelAutomation.SwitchStatus.ON;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HotelAutomationTest {
    @Test
    void shouldSwitchOnLightOfMainCorridorAllTime() {
        HotelAutomation hotel = createHotel(1, 1, 1);
        List<Floor> floors = hotel.getFloors();
        Floor floor = floors.get(0);
        List<MainCorridor> mainCorridors = floor.getMainCorridors();
        MainCorridor mainCorridor = mainCorridors.get(0);
        SwitchStatus lightStatus = mainCorridor.getLightSwitch();
        assertThat(lightStatus, is(equalTo(ON)));
    }

    @Test
    void shouldSwitchOnACOfMainCorridorAllTime() {
        HotelAutomation hotel = createHotel(1, 1, 1);
        List<Floor> floors = hotel.getFloors();
        Floor floor = floors.get(0);
        List<MainCorridor> mainCorridors = floor.getMainCorridors();
        MainCorridor mainCorridor = mainCorridors.get(0);
        SwitchStatus ACStatus = mainCorridor.getACSwitch();
        assertThat(ACStatus, is(equalTo(ON)));
    }
}
