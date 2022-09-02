package org.example;

public class Main {
    public static void main(String[] args) {

        LightMatrix matrix = new LightMatrix(10,10);
        matrix.turnOnRange(2,2, 5, 5);
        matrix.turnOffRange(2,3, 5, 3);
        matrix.toggleRange(2,2, 5, 5);

        System.out.println("Hello world!");
    }
}
