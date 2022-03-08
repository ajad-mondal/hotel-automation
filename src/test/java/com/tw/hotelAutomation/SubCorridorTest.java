package com.tw.hotelAutomation;

import org.junit.jupiter.api.Test;

import static com.tw.hotelAutomation.SwitchStatus.OFF;
import static com.tw.hotelAutomation.SwitchStatus.ON;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SubCorridorTest {

    public static final int TWO_SECONDS = 2000;

    @Test
    void shouldSwitchOnLightWhenMotionIsDetected() {
        SubCorridor subCorridor = new SubCorridor();

        subCorridor.actOnMotion(TWO_SECONDS);
        SwitchStatus lightSwitch = subCorridor.getLightSwitch();

        assertThat(lightSwitch, is(ON));
    }

    @Test
    void shouldSwitchOffAcWhenMotionIsDetected() {
        SubCorridor subCorridor = new SubCorridor();

        subCorridor.actOnMotion(TWO_SECONDS);
        SwitchStatus acSwitch = subCorridor.getAcSwitch();

        assertThat(acSwitch, is(OFF));
    }

    @Test
    void shouldSwitchOffLightOneMinuteAfterMotion() throws InterruptedException {
        SubCorridor subCorridor = new SubCorridor();

        subCorridor.actOnMotion(TWO_SECONDS);
        Thread.sleep(TWO_SECONDS);
        SwitchStatus lightSwitch = subCorridor.getLightSwitch();

        assertThat(lightSwitch, is(OFF));
    }

    @Test
    void shouldSwitchOnAcOneMinuteAfterMotion() throws InterruptedException {
        SubCorridor subCorridor = new SubCorridor();

        subCorridor.actOnMotion(TWO_SECONDS);
        Thread.sleep(TWO_SECONDS);
        SwitchStatus acSwitch = subCorridor.getAcSwitch();

        assertThat(acSwitch, is(OFF));
    }
}
