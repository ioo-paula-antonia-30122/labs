package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;
    private static int numberOfVehicles = 0;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        if (speed<0)
            throw new IllegalArgumentException("Speed can't be negative!");
        else
            this.speed = speed;
        if (fuelType != 'D' && fuelType != 'B')
            throw new IllegalArgumentException("Must be D or B! ");
        else
            this.fuelType = fuelType;

        numberOfVehicles++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed<0)
            throw new IllegalArgumentException("Speed can't be negative!");
        else
            this.speed = speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        if (fuelType != 'D' && fuelType != 'B')
            throw new IllegalArgumentException("Must be D or B! ");
        else
            this.fuelType = fuelType;
    }


    @Override
    public String toString() {
        return model + " (" + type + ") speed " + speed + " fuel type " + fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && fuelType == vehicle.fuelType && Objects.equals(model, vehicle.model) && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, speed, fuelType);
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public static void displayNumberOfVehicles() {
        System.out.println("Number of objects of type vehicles created is: " + numberOfVehicles);
    }
}