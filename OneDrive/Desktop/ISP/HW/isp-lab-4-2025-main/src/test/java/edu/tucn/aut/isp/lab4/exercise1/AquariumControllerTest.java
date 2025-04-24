package edu.tucn.aut.isp.lab4.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

class AquariumControllerTest {
    //implement minimal tests
    @Test
    void dummyTestNPE() {
        Assertions.assertThrows(
                NullPointerException.class, () -> {
                    Integer nullInt = null;
                    nullInt.toString();
                });
    }


    @Test
    void testToString() {
        AquariumController aquariumController = new AquariumController("Neptune", "Apex JR", LocalTime.now());
        aquariumController.setCurrentTime(LocalTime.of(18, 30));
        Assertions.assertEquals(aquariumController.toString(), "AquariumController {manufacturer=' Neptune', model='Apex JR', currentTime=18:30}");

        AquariumController aquariumController1 = new AquariumController("Neptune", "Apex JR", LocalTime.now());
        aquariumController1.setCurrentTime(LocalTime.of(12, 30));
        Assertions.assertEquals(aquariumController1.toString(), "AquariumController {manufacturer=' Neptune', model='Apex JR', currentTime=12:30}");

        AquariumController aquariumController2 = new AquariumController("Neptune", "Apex JR", LocalTime.of(13, 20));
        Assertions.assertEquals(aquariumController2.toString(), "AquariumController {manufacturer=' Neptune', model='Apex JR', currentTime=13:20}");
    }
}
