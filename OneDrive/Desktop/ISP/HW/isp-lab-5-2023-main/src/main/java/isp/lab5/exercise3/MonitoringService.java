package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public void addSensor(Sensor sensor) {
        if (sensors.size() < 10)
            sensors.add(sensor);
        else
            System.out.println("You can only add 10 sensors!");
    }

    public double getAverageTemperatureSensor() {
        double sum = 0;
        int count = 0;

        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                sum = sum + ((TemperatureSensor) sensor).getTemperature();
                count++;
            }
        }
        if (count == 0)
            System.out.println("There are not temperature sensors!");
        else
            System.out.println("The average of temperature sensors is: ");
        return (double) sum / count;
    }

    public double getAverageAllSensors() {
        double sum = 0;
        int count = 0;

        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                sum = sum + ((TemperatureSensor) sensor).getTemperature();
                count++;
            } else if (sensor instanceof PressureSensor) {
                sum = sum + ((PressureSensor) sensor).getPressure();
                count++;
            }
        }
        if (count == 0)
            System.out.println("There aren't any sensors introduced!");
        else
            System.out.println("The average of all sensors is: ");
        return (double) sum / count;
    }
}
