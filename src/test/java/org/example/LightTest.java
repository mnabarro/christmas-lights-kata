package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LightTest {

    @Test
    void getValueTest() {
        Light light = new Light();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }

    @Test
    void turnOnTest() {
        Light light = new Light();

        light.turnOn();
        Assertions.assertThat(light.getValue()).isEqualTo(1);
    }

    @Test
    void turnOffTest() {
        Light light = new Light();
        light.turnOn();

        light.turnOff();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }

    @Test
    void toggleTest() {
        Light light = new Light();

        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(1);

        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }
}
