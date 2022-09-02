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

    @Test
    void turnOnRangeTest() {

        LightMatrix matrix = new LightMatrix(10, 10);
        matrix.turnOnRange(3,3,4,4);

        Assertions.assertThat(matrix.getValue(3,3)).isEqualTo(1);
        Assertions.assertThat(matrix.getValue(3,4)).isEqualTo(1);
        Assertions.assertThat(matrix.getValue(4,3)).isEqualTo(1);
        Assertions.assertThat(matrix.getValue(4,4)).isEqualTo(1);
    }

    @Test
    void turnOffRangeTest() {

        LightMatrix matrix = new LightMatrix(10, 10);
        matrix.turnOnRange(0,0,9,9);
        matrix.turnOffRange(4,0,5,1);

        Assertions.assertThat(matrix.getValue(4,0)).isEqualTo(0);
        Assertions.assertThat(matrix.getValue(4,1)).isEqualTo(0);
        Assertions.assertThat(matrix.getValue(5,0)).isEqualTo(0);
        Assertions.assertThat(matrix.getValue(5,1)).isEqualTo(0);
    }

    @Test
    void toggleRangeTest() {

        LightMatrix matrix = new LightMatrix(10, 10);
        matrix.turnOnRange(0,0,4,4);
        matrix.toggleRange(3,3,4,4);

        Assertions.assertThat(matrix.getValue(3,3)).isEqualTo(0);
        Assertions.assertThat(matrix.getValue(3,4)).isEqualTo(0);
        Assertions.assertThat(matrix.getValue(4,3)).isEqualTo(0);
        Assertions.assertThat(matrix.getValue(4,4)).isEqualTo(0);
    }
}
