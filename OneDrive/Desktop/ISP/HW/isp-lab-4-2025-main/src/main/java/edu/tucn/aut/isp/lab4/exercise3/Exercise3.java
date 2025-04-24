package edu.tucn.aut.isp.lab4.exercise3;

import java.time.LocalTime;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000",14);
        AquariumController aquariumController = new AquariumController("Neptune", "Apex JR", LocalTime.of(14, 30), fishFeeder);
        System.out.println(aquariumController.toString());

        aquariumController.setFeedingTime(LocalTime.of(15, 30));
        System.out.println(aquariumController.toString());

        aquariumController.setCurrentTime(LocalTime.of(15, 30));
        System.out.println(aquariumController.toString());

        System.out.println(fishFeeder.toString());

    }
}
