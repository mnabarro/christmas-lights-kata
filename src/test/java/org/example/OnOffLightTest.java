package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OnOffLightTest {

    @Test
    void getValueTest() {
        OnOffLight light = new OnOffLight();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }

    @Test
    void turnOnTest() {
        OnOffLight light = new OnOffLight();

        light.turnOn();
        Assertions.assertThat(light.getValue()).isEqualTo(1);
    }

    @Test
    void turnOffTest() {
        OnOffLight light = new OnOffLight();
        light.turnOn();

        light.turnOff();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }

    @Test
    void toggleTest() {
        OnOffLight light = new OnOffLight();

        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(1);

        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }
}
