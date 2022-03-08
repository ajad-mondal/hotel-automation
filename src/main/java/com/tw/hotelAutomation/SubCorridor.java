package com.tw.hotelAutomation;

import java.util.Timer;
import java.util.TimerTask;

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

    public void actOnMotion(int resetTime) {
        this.lightSwitch = ON;
        this.acSwitch = OFF;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                lightSwitch = OFF;
                acSwitch = ON;
            }
        }, resetTime);
    }
}
