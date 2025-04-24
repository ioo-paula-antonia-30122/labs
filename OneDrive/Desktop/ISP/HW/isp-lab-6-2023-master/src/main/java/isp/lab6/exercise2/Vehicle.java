package isp.lab6.exercise2;

import java.util.Objects;

public class Vehicle {
    private String VIN;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Vehicle(String VIN, String licensePlate, String make, String model, int year) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Vehicle vehicle =(Vehicle) obj;
        return VIN.equals(vehicle.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN);
    }

    @Override
    public String toString() {
        return "Vehicle {" +
                "VIN='" + VIN + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
