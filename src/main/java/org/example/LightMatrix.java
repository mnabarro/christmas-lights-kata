package org.example;

import java.util.ArrayList;

public class LightMatrix {

    private final ArrayList<ArrayList<Light>> matrix;
    private final Integer width;
    private final Integer height;

    public LightMatrix(Integer width, Integer height) {
        this.width = width;
        this.height = height;
        ArrayList<Light> row;
        this.matrix = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            row = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                row.add(new Light());
            }
            matrix.add(row);
        }
    }

    public Integer getValue(Integer column, Integer row) {

        return matrix.get(row).get(column).getValue();
    }

    public void turnOn(Integer column, Integer row) {

        matrix.get(row).get(column).turnOn();

    }

    public void turnOnRange (Integer columnFrom, Integer rowFrom, Integer columnTo, Integer rowTo) {
        for (int i = columnFrom; i < columnTo + 1; i++) {
            for (int j = rowFrom; j < rowTo + 1; j++) {
                turnOn(i, j);
            }
        }
    }

    public void turnOff(Integer column, Integer row) {

        matrix.get(row).get(column).turnOff();

    }

    public void turnOffRange (Integer columnFrom, Integer rowFrom, Integer columnTo, Integer rowTo) {
        for (int i = columnFrom; i < columnTo + 1; i++) {
            for (int j = rowFrom; j < rowTo + 1; j++) {
                turnOff(i, j);
            }
        }
    }

    public void toggle(Integer column, Integer row) {

        matrix.get(row).get(column).toggle();

    }
    public void toggleRange (Integer columnFrom, Integer rowFrom, Integer columnTo, Integer rowTo) {
        for (int i = columnFrom; i < columnTo + 1; i++) {
            for (int j = rowFrom; j < rowTo + 1; j++) {
                toggle(i, j);
            }
        }
    }

}
