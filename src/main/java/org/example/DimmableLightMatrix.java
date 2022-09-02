package org.example;

import java.util.ArrayList;

public class DimmableLightMatrix extends LightMatrix{

    public DimmableLightMatrix(Integer width, Integer height) {
        super(width, height);
        ArrayList<Light> row;

        for (int i = 0; i < height; i++) {
            row = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                row.add(new DimmableLight());
            }
            matrix.add(row);
        }
    }

    public Integer lightsAccumValue () {
        int accum = 0;

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                accum+= getValue(i, j);
            }
        }
        return accum;
    }

}
