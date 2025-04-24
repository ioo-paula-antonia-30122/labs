package edu.tucn.aut.isp.lab4.exercise1;

import java.time.LocalTime;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController aquariumController = new AquariumController("Neptune", "Apex JR", LocalTime.now());
        System.out.println(aquariumController.toString());

        aquariumController.setCurrentTime(LocalTime.of(12, 30));
        System.out.println(aquariumController.toString());


    }
}
