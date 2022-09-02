package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LightMatrixTest {

    @Test
    void getValueTest() {
        LightMatrix matrix = new LightMatrix(10, 10);
        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(0);
    }
    @Test
    void turnOnTest() {

        LightMatrix matrix = new LightMatrix(10, 10);
        matrix.turnOn(2,2);

        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(1);
    }

    @Test
    void turnOffTest() {

        LightMatrix matrix = new LightMatrix(10, 10);
        matrix.turnOn(2,2);
        matrix.turnOff(2,2);

        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(0);
    }

    @Test
    void toggleTest() {

        LightMatrix matrix = new LightMatrix(10, 10);
        matrix.toggle(2,2);

        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(1);
    }
}
