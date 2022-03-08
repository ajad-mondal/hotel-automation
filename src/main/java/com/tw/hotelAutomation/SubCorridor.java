package com.tw.hotelAutomation;

import static com.tw.hotelAutomation.SwitchStatus.OFF;
import static com.tw.hotelAutomation.SwitchStatus.ON;

public class SubCorridor {
    private SwitchStatus lightSwitch;
    private SwitchStatus acSwitch;


    public SubCorridor() {
        lightSwitch = OFF;
        acSwitch = ON;
    }

    public SwitchStatus getLightSwitch() {
        return this.lightSwitch;
    }

    public SwitchStatus getAcSwitch() {
        return this.acSwitch;
    }

    public void actOnMotion() {
        this.lightSwitch = ON;
    }
}
