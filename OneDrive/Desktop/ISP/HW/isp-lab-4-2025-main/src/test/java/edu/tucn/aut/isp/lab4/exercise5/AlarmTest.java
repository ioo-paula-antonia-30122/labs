package edu.tucn.aut.isp.lab4.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void testAlarm() {
        Alarm alarm = new Alarm("Alarm", "1000");
        Assertions.assertFalse(alarm.isOn());

        alarm.turnOn();
        Assertions.assertTrue(alarm.isOn());

        alarm.turnOff();
        Assertions.assertFalse(alarm.isOn());

    }


}
