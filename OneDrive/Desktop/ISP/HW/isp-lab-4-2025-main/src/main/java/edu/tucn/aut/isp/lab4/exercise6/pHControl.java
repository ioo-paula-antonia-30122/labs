package edu.tucn.aut.isp.lab4.exercise6;

public class pHControl {
    private final static double safeMinValue = 6.8;
    private final static double safeMaxValue = 7.8;
    private final static double safeControlValue = 0.3;
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean checkpHMin() {
        if (Math.abs(value - safeMinValue) <= safeControlValue && value >= (safeMinValue - safeControlValue) && value <= (safeMinValue + safeControlValue)) {
            System.out.println("Adding a base to increase the pHLevel!");
            return true;
        }
        return false;
    }

    public boolean checkpHMax() {
        if (Math.abs(safeMaxValue - value) <= safeControlValue && value >= (safeMaxValue - safeControlValue) && value <= (safeMaxValue + safeControlValue)) {
            System.out.println("Adding an acid to neutralize the pHLevel!");
            return true;
        }
        return false;
    }

    public boolean isBetween() {
        return value >= safeMinValue && value <= safeMaxValue;
    }

}
