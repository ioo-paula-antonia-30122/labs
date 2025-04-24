package edu.tucn.aut.isp.lab4.exercise5;

public class Lights {
    private boolean isOn;

    public Lights() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lights are on!");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lights are off!");
    }

    public boolean isOn() {
        return isOn;
    }

}
