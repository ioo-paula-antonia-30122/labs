package edu.tucn.aut.isp.lab4.exercise3;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = meals;
    }

    public int getMeals() {
        return meals;
    }


    public void fillUp() {
        this.meals = 14;
        System.out.println("FishFeeder was filled up");
    }

    public void feed() {
        if (this.meals > 0 && this.meals <= 14) {
            this.meals--;
            System.out.println("Fishes were fed. Remaining meals available: " + meals);
        } else {
            if (meals <= 0)
                System.out.println("Not enough meals available, please fill up");
            throw new IllegalArgumentException("14 meals allowed, please introduce a smaller number of meals!");
        }
    }

    @Override

    public String toString() {
        return "FishFeeder {" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }
}
