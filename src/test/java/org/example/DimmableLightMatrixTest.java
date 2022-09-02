package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DimmableLightMatrixTest {

    @Test
    void getValueTest() {

        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);
        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(0);
    }

    @Test
    void turnOnTest() {

        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);

        matrix.turnOn(2,2);
        matrix.turnOn(2,2);
        matrix.turnOn(2,2);

        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(3);
    }

    @Test
    void turnOnRangeTest() {

        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);

        matrix.turnOnRange(3,3,4,4);
        matrix.turnOnRange(3,3,4,4);

        Assertions.assertThat(matrix.getValue(3,3)).isEqualTo(2);
        Assertions.assertThat(matrix.getValue(3,4)).isEqualTo(2);
        Assertions.assertThat(matrix.getValue(4,3)).isEqualTo(2);
        Assertions.assertThat(matrix.getValue(4,4)).isEqualTo(2);
    }

    @Test
    void turnOffTest() {

        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);
        matrix.turnOn(2,2);
        matrix.turnOn(2,2);
        matrix.turnOn(2,2);
        matrix.turnOn(2,2);
        matrix.turnOff(2,2);

        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(3);
    }

    @Test
    void turnOffRangeTest() {

        DimmableLightMatrix matrix = new DimmableLightMatrix(5, 5);
        matrix.turnOnRange(0,0,2,2);
        matrix.turnOnRange(0,0,2,2);
        matrix.turnOnRange(0,0,2,2);
        matrix.turnOffRange(0,0,2,2);

        Assertions.assertThat(matrix.getValue(0,0)).isEqualTo(2);
        Assertions.assertThat(matrix.getValue(0,1)).isEqualTo(2);
        Assertions.assertThat(matrix.getValue(1,0)).isEqualTo(2);
        Assertions.assertThat(matrix.getValue(1,1)).isEqualTo(2);
    }

    @Test
    void toggleTest() {
        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);

        matrix.toggle(2,2);
        matrix.toggle(2,2);

        Integer value =  matrix.getValue(2,2);

        Assertions.assertThat(value).isEqualTo(4);
    }

    @Test
    void toggleRangeTest() {

        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);
        matrix.turnOnRange(0,0,4,4);
        matrix.toggleRange(3,3,4,4);

        Assertions.assertThat(matrix.getValue(3,3)).isEqualTo(3);
        Assertions.assertThat(matrix.getValue(3,4)).isEqualTo(3);
        Assertions.assertThat(matrix.getValue(4,3)).isEqualTo(3);
        Assertions.assertThat(matrix.getValue(4,4)).isEqualTo(3);
    }

    @Test
    void lightsAccumValueTest() {
        DimmableLightMatrix matrix = new DimmableLightMatrix(10, 10);
        matrix.turnOnRange(0,0,3,3);
        matrix.toggleRange(4,4,7,7);
        Assertions.assertThat(matrix.lightsAccumValue()).isEqualTo(48);
    }
}
