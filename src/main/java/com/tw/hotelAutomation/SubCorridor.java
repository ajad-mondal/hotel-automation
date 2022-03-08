package com.tw.hotelAutomation;

import static com.tw.hotelAutomation.SwitchStatus.OFF;

public class SubCorridor {
    private SwitchStatus lightSwitch;



    public SubCorridor() {
        lightSwitch = OFF;
    }

    public SwitchStatus getLightSwitch() {
        return this.lightSwitch;
    }
}
