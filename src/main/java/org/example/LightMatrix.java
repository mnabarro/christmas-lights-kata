package org.example;

import java.util.ArrayList;

public class LightMatrix {
    protected final ArrayList<ArrayList<Light>> matrix;
    protected final Integer width;
    protected final Integer height;
    public interface SetLightStatus {
        void changer(Integer column, Integer row);
    }
    void setStatusRange(Integer colFrom, Integer rowFrom, Integer colTo, Integer rowTo, SetLightStatus status) {
        for (int i = colFrom; i < colTo + 1; i++) {
            for (int j = rowFrom; j < rowTo + 1; j++) {
                status.changer(i, j);
            }
        }
    }

    public LightMatrix(Integer width, Integer height) {
        this.matrix = new ArrayList<>();
        this.width = width;
        this.height = height;
    }
    public Integer getValue(Integer column, Integer row) {

        return matrix.get(row).get(column).getValue();
    }
    public void turnOn(Integer column, Integer row) {

        matrix.get(row).get(column).turnOn();

    }
    public void turnOnRange(Integer columnFrom, Integer rowFrom, Integer columnTo, Integer rowTo) {
        setStatusRange(columnFrom, rowFrom, columnTo, rowTo, this::turnOn);
    }

    public void turnOff(Integer column, Integer row) {

        matrix.get(row).get(column).turnOff();

    }

    public void turnOffRange(Integer columnFrom, Integer rowFrom, Integer columnTo, Integer rowTo) {
        setStatusRange(columnFrom, rowFrom, columnTo, rowTo, this::turnOff);
    }

    public void toggle(Integer column, Integer row) {

        matrix.get(row).get(column).toggle();

    }

    public void toggleRange(Integer columnFrom, Integer rowFrom, Integer columnTo, Integer rowTo) {
        setStatusRange(columnFrom, rowFrom, columnTo, rowTo, this::toggle);
    }
}
