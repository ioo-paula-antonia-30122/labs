package isp.lab5.exercise3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise3Test {

    @Test
    public void testGetAllAverageTemperatureSensors(){
        TemperatureSensor temperatureSensor1 = new TemperatureSensor("Bedroom", "Temperature", 25);
        TemperatureSensor temperatureSensor = new TemperatureSensor("Guest room", "Temperature", 19);

        List<Sensor> sensors = new ArrayList<>();
        MonitoringService monitoringService = new MonitoringService(sensors);

        monitoringService.addSensor(temperatureSensor);
        monitoringService.addSensor(temperatureSensor1);

        Assert.assertEquals(22.0,monitoringService.getAverageTemperatureSensor(),0.01);

        Assert.assertEquals(2,sensors.size());

        TemperatureSensor temperatureSensor2 = new TemperatureSensor("Bedroom", "Temperature", 20);
        TemperatureSensor temperatureSensor3 = new TemperatureSensor("Guest room", "Temperature", 29);

        TemperatureSensor temperatureSensor4 = new TemperatureSensor("Bedroom", "Temperature", 30);
        TemperatureSensor temperatureSensor5 = new TemperatureSensor("Guest room", "Temperature", 29);

        monitoringService.addSensor(temperatureSensor2);
        monitoringService.addSensor(temperatureSensor3);

        Assert.assertEquals(4,sensors.size());

        monitoringService.addSensor(temperatureSensor4);
        monitoringService.addSensor(temperatureSensor5);

        Assert.assertEquals(6,sensors.size());

        Assert.assertEquals(25.33,monitoringService.getAverageTemperatureSensor(),0.01);

    }

    @Test
    public void testGetAllSensorsAverage(){
        TemperatureSensor temperatureSensor1 = new TemperatureSensor("Bedroom", "Temperature", 25);
        TemperatureSensor temperatureSensor = new TemperatureSensor("Guest room", "Temperature", 19);

        List<Sensor> sensors = new ArrayList<>();
        MonitoringService monitoringService = new MonitoringService(sensors);

        monitoringService.addSensor(temperatureSensor);
        monitoringService.addSensor(temperatureSensor1);

        PressureSensor pressureSensor = new PressureSensor("Kitchen", "Pressure", 1000);
        PressureSensor pressureSensor1 = new PressureSensor("Bathroom", "Pressure", 1200);

        monitoringService.addSensor(pressureSensor);
        monitoringService.addSensor(pressureSensor1);

        Assert.assertEquals(561.0, monitoringService.getAverageAllSensors(),0.01);

        Assert.assertEquals(4,sensors.size());

        PressureSensor pressureSensor2 = new PressureSensor("Kitchen", "Pressure", 2000);
        PressureSensor pressureSensor3 = new PressureSensor("Bathroom", "Pressure", 2200);
        TemperatureSensor temperatureSensor2 = new TemperatureSensor("Bedroom", "Temperature", 20);
        TemperatureSensor temperatureSensor3 = new TemperatureSensor("Guest room", "Temperature", 29);

        PressureSensor pressureSensor4 = new PressureSensor("Kitchen", "Pressure", 1400);
        PressureSensor pressureSensor5 = new PressureSensor("Bathroom", "Pressure", 1700);
        TemperatureSensor temperatureSensor4 = new TemperatureSensor("Bedroom", "Temperature", 30);
        TemperatureSensor temperatureSensor5 = new TemperatureSensor("Guest room", "Temperature", 29);

        monitoringService.addSensor(pressureSensor2);
        monitoringService.addSensor(pressureSensor3);
        monitoringService.addSensor(temperatureSensor2);
        monitoringService.addSensor(temperatureSensor3);

        Assert.assertEquals(8,sensors.size());

        monitoringService.addSensor(pressureSensor4);
        monitoringService.addSensor(pressureSensor5);

        Assert.assertEquals(10,sensors.size());

        monitoringService.addSensor(temperatureSensor4);
        monitoringService.addSensor(temperatureSensor5);

        Assert.assertEquals(10,sensors.size());

        Assert.assertEquals(959.3, monitoringService.getAverageAllSensors(),0.01);
    }
}
