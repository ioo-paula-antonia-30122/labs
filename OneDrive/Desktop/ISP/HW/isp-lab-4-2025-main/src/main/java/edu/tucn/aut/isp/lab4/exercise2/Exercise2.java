package edu.tucn.aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder fishFeeder=new FishFeeder("Fish Feeder","1000",13);
        System.out.println(fishFeeder.toString());

        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        System.out.println(fishFeeder.toString());

        fishFeeder.fillUp();
        System.out.println(fishFeeder.toString());

        FishFeeder fishFeeder1=new FishFeeder("Fish Feeder","1000",15);
        System.out.println(fishFeeder1.toString());
        fishFeeder1.feed();


    }
}
