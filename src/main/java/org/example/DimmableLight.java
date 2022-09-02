package org.example;

public class DimmableLight implements Light {

    private Integer value=0;
    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public void turnOn() {
        this.value +=1;
    }

    @Override
    public void turnOff() {
        if(this.value>0) {
            this.value-=1;
        }
    }

    @Override
    public void toggle() {
        this.value+=2;
    }
}
