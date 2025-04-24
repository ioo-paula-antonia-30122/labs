package edu.tucn.aut.isp.lab4.exercise4;

import edu.tucn.aut.isp.lab4.exercise4.AquariumController;
import edu.tucn.aut.isp.lab4.exercise4.FishFeeder;

import java.time.LocalTime;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000",14);
        Lights lights=new Lights();
        AquariumController aquariumController = new AquariumController("Neptune", "Apex JR", LocalTime.of(10, 00), LocalTime.of(10,00), fishFeeder, lights, LocalTime.of(11,00),LocalTime.of(18,00));
        System.out.println(aquariumController.toString());
        aquariumController.setCurrentTime(LocalTime.of(11,00));
        System.out.println(aquariumController.toString());
        aquariumController.setCurrentTime(LocalTime.of(18,00));
        System.out.println(aquariumController.toString());

    }
}
