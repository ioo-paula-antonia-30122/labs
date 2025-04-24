package edu.tucn.aut.isp.lab4.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class AquariumControlerTest {

    @Test
    public void testLight() {
        Lights lights = new Lights();
        FishFeeder fishFeeder=new FishFeeder("Fish Feeder", "1000",14);
        AquariumController aquariumController=new AquariumController("Neptune","Apex JR", LocalTime.of(14,30),LocalTime.of(14,30),fishFeeder,lights,LocalTime.of(11,00),LocalTime.of(19,00));

        aquariumController.setCurrentTime(LocalTime.of(10,00));
        Assertions.assertFalse(lights.isOn());

        aquariumController.setCurrentTime(LocalTime.of(11,00));
        Assertions.assertTrue(lights.isOn());

        aquariumController.setCurrentTime(LocalTime.of(19,00));
        Assertions.assertFalse(lights.isOn());
    }
}
