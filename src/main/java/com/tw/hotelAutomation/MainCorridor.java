package com.tw.hotelAutomation;

import static com.tw.hotelAutomation.SwitchStatus.ON;

public class MainCorridor {

    private SwitchStatus lightStatus;

    public MainCorridor() {
        this.lightStatus = ON;
    }

    public SwitchStatus getLightSwitch() {
        return this.lightStatus;
    }
}
