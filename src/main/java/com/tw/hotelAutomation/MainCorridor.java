package com.tw.hotelAutomation;

import static com.tw.hotelAutomation.SwitchStatus.ON;

public class MainCorridor {

    private SwitchStatus lightStatus;
    private SwitchStatus ACStatus;

    public MainCorridor() {
        this.lightStatus = ON;
        this.ACStatus = ON;
    }

    public SwitchStatus getLightSwitch() {
        return this.lightStatus;
    }

    public SwitchStatus getACSwitch() {
        return this.ACStatus;
    }
}
