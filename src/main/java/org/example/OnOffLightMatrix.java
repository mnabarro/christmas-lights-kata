package org.example;

import java.util.ArrayList;

public class OnOffLightMatrix extends LightMatrix {

    public OnOffLightMatrix(Integer width, Integer height) {
        super(width, height);

        ArrayList<Light> row;

        for (int i = 0; i < height; i++) {
            row = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                row.add(new OnOffLight());
            }
            matrix.add(row);
        }
    }

    public Integer countLightsOn () {
        int count = 0;

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                if( getValue(i, j) == 1) {
                    count +=1;
                }
            }
        }
        return count;
    }
}
