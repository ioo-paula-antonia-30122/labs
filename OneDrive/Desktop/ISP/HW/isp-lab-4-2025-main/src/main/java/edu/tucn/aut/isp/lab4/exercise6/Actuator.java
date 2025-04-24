package edu.tucn.aut.isp.lab4.exercise6;

public class Actuator {
    private String manufacturer;
    private String model;
    private boolean on = false;

    public Actuator(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public boolean isOn() {
        return on;
    }


    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    @Override
    public String toString() {
        return "Actuator {" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", on=" + on +
                '}';
    }

}
