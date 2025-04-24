package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        PressureSensor pressureSensor = new PressureSensor("Kitchen", "Pressure", 1000);
        PressureSensor pressureSensor1 = new PressureSensor("Bathroom", "Pressure", 1200);
        TemperatureSensor temperatureSensor1 = new TemperatureSensor("Bedroom", "Temperature", 25);
        TemperatureSensor temperatureSensor = new TemperatureSensor("Guest room", "Temperature", 19);

        List<Sensor> sensors = new ArrayList<>();
        MonitoringService monitoringService = new MonitoringService(sensors);

        monitoringService.addSensor(pressureSensor);
        monitoringService.addSensor(pressureSensor1);
        monitoringService.addSensor(temperatureSensor);
        monitoringService.addSensor(temperatureSensor1);

        System.out.println(monitoringService.getAverageTemperatureSensor());
        System.out.println(monitoringService.getAverageAllSensors());

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

        System.out.println(monitoringService.getAverageTemperatureSensor());
        System.out.println(monitoringService.getAverageAllSensors());

        monitoringService.addSensor(pressureSensor4);
        monitoringService.addSensor(pressureSensor5);

        System.out.println(monitoringService.getAverageTemperatureSensor());
        System.out.println(monitoringService.getAverageAllSensors());

        monitoringService.addSensor(temperatureSensor4);
        monitoringService.addSensor(temperatureSensor5);
    }
}
