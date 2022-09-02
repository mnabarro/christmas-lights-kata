package org.example;

public class Main {
    public static void main(String[] args) {

        LightMatrix matrix = new LightMatrix(10,10);
//
        matrix.turnOnRange(0,0, 8, 8);
//        matrix.turnOnRange(887,9, 959, 629);
//        matrix.turnOnRange(454,398, 844, 448);
//
//        matrix.turnOffRange(539,243, 559, 965);
//        matrix.turnOffRange(370,819, 676, 868);
//        matrix.turnOffRange(145,40, 370, 997);
//        matrix.turnOffRange(301,3, 808, 453);
//
//        matrix.turnOnRange(351,678, 951, 908);
//
//        matrix.toggleRange(720,196,897,994);
//        matrix.toggleRange(831,394,904,860);

        System.out.println(matrix.countLightsOn().toString());

    }
}
