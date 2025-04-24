package edu.tucn.aut.isp.lab4.exercise3;

import edu.tucn.aut.isp.lab4.exercise3.AquariumController;
import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class AquariumControllerTest {

    @Test
    void testToFeed() {
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000",14);
        AquariumController aquariumController = new AquariumController("Neptune", "Apex JR", LocalTime.of(14, 30), fishFeeder);

        aquariumController.setFeedingTime(LocalTime.of(15, 30));
        Assertions.assertEquals(14, fishFeeder.getMeals());

        aquariumController.setCurrentTime(LocalTime.of(15,30));
        Assertions.assertEquals(13, fishFeeder.getMeals());
    }
}
