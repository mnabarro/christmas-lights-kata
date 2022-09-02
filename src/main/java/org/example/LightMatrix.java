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

    public void turnOff(Integer column, Integer row) {

        matrix.get(row).get(column).turnOff();

    }

    public void toggle(Integer column, Integer row) {

        matrix.get(row).get(column).toggle();

    }
}
