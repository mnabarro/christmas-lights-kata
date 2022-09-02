package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LightTest {

    @Test
    void getValue() {
        Light light = new Light(1);
        Assertions.assertThat(light.getValue()).isEqualTo(1);
    }

    @Test
    void setValue() {
        Light light = new Light(0);

        light.setValue(1);
        Assertions.assertThat(light.getValue()).isEqualTo(1);
    }

    @Test
    void toggle() {
        Light light = new Light(0);

        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(1);

        light.toggle();
        Assertions.assertThat(light.getValue()).isEqualTo(0);
    }
}
