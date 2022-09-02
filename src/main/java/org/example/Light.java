package org.example;

public class Light {
    private Integer value = 0;

    public Integer getValue() {
        return this.value;
    }

    public void turnOn() {
        this.value = 1;
    }
    public void turnOff() {
        this.value = 0;
    }

    public void toggle() {
        switch (this.value) {
            case 0 -> this.value = 1;
            case 1 -> this.value = 0;
        }
    }
}
