package edu.tucn.aut.isp.lab4.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FishFeederTest {

    @Test
    void testFillUp() {
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000",13);
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.fillUp();
        Assertions.assertEquals(fishFeeder.toString(), "FishFeeder {manufacturer='Fish Feeder', model='1000', meals=14}");

        FishFeeder fishFeeder1 = new FishFeeder("Fish Feeder", "1000",14);
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.feed();
        fishFeeder1.fillUp();
        Assertions.assertEquals(fishFeeder1.toString(), "FishFeeder {manufacturer='Fish Feeder', model='1000', meals=14}");
    }


    @Test
    void testFeed() {
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000",14);
        fishFeeder.feed();
        fishFeeder.feed();
        Assertions.assertEquals(fishFeeder.toString(), "FishFeeder {manufacturer='Fish Feeder', model='1000', meals=12}");

        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        fishFeeder.feed();
        Assertions.assertEquals(fishFeeder.toString(), "FishFeeder {manufacturer='Fish Feeder', model='1000', meals=2}");

    }
}
