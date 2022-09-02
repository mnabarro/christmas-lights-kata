package org.example;

public class Light {
    private Integer value;

    public Light(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void toggle() {
        switch (this.value) {
            case 0 -> this.value = 1;
            case 1 -> this.value = 0;
        }
    }
}
