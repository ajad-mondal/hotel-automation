package com.tw.hotelAutomation;

import org.junit.jupiter.api.Test;

import static com.tw.hotelAutomation.SwitchStatus.ON;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SubCorridorTest {
    @Test
    void shouldSwitchOnLightWhenMotionIsDetected() {
        SubCorridor subCorridor = new SubCorridor();

        subCorridor.actOnMotion();
        SwitchStatus lightSwitchAfterMotion = subCorridor.getLightSwitch();

        assertThat(lightSwitchAfterMotion, is(ON));
    }
}
