package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DimmableLightTest {

    @Test
    void getValue() {

        DimmableLight light = new DimmableLight();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }

    @Test
    void turnOn() {
        DimmableLight light = new DimmableLight();
        light.turnOn();
        light.turnOn();
        Assertions.assertThat(light.getValue()).isEqualTo(2);
    }

    @Test
    void turnOff() {
        DimmableLight light = new DimmableLight();
        light.turnOn();
        light.turnOn();
        light.turnOn();
        light.turnOff();
        Assertions.assertThat(light.getValue()).isEqualTo(2);
    }

    @Test
    void turnOffOnlyToZero() {
        DimmableLight light = new DimmableLight();
        light.turnOff();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }

    @Test
    void toggle() {
        DimmableLight light = new DimmableLight();
        light.toggle();
        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(4);
    }
}
