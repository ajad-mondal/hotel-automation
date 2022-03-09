package com.tw.hotelAutomation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MotionSensorTest {
    @Test
    void shouldReturnTwoIntegerWhenNextInputIsCalled() {
        MotionSensor sensor = new MotionSensor(2, 2);

        int[] input = sensor.nextInput();
        int numbersReturned = input.length;

        assertThat(numbersReturned, is(2));
    }
}
