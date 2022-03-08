package com.tw.hotelAutomation;

import static com.tw.hotelAutomation.SwitchStatus.ON;

public class MainCorridor {

    private SwitchStatus lightStatus;
    private SwitchStatus acStatus;

    public MainCorridor() {
        this.lightStatus = ON;
        this.acStatus = ON;
    }

    public SwitchStatus getLightSwitch() {
        return this.lightStatus;
    }

    public SwitchStatus getAcSwitch() {
        return this.acStatus;
    }
}
