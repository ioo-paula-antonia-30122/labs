package edu.tucn.aut.isp.lab4.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LevelSensorTest {

    @Test
    public void testLevelSensor(){
        LevelSensor levelSensor = new LevelSensor("Level", "1000", 500);
        Assertions.assertEquals(500,levelSensor.getValue());

        levelSensor.setValue(450);
        Assertions.assertEquals(450,levelSensor.getValue());

    }
}
