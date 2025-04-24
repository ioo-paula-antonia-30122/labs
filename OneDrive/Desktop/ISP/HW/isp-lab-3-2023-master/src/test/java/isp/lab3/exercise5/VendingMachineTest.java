package isp.lab3.exercise5;

import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

    //@Test
    /*public void testdisplayProducts() {
        VendingMachine vending = new VendingMachine();

        Assert.("ID: 1 --- Coca-Cola 6 RON \n" +
                "ID: 2 --- Fibrobar-R 4 RON \n" +
                "ID: 3 --- Apa minerala 3 RON \n" +
                "ID: 4 --- Apa plata 3 RON \n" +
                "ID: 5 --- Cappy 6 RON \n" +
                "ID: 6 --- Sprite 6 RON \n" +
                "ID: 7 --- Chipsuri 10 RON \n" +
                "ID: 8 --- Sandwich 15 RON \n" +
                "ID: 9 --- Cafea doza 5 \n" +
                "RON ID: 10 --- Saratele 7 RON \n", vending.displayProducts());

    }*/ //conflict, this can't be tested because is void; we can do it only if we capture the output

    @Test
    public void testInsertCoin() {
        VendingMachine vending = new VendingMachine();

        vending.insertCoin(5);
        vending.insertCoin(10);
        vending.insertCoin(1);
        Assert.assertEquals(16, vending.getCredit());

        vending.insertCoin(3);
        Assert.assertEquals(16, vending.getCredit());

        vending.insertCoin(-10);
        Assert.assertEquals(16, vending.getCredit());
    }

    @Test
    public void testSelectProduct() {
        VendingMachine vending = new VendingMachine();

        vending.insertCoin(10);
        Assert.assertEquals("Product: Coca-Cola is on its way! \n", vending.selectProduct(1));

        Assert.assertEquals(4, vending.getCredit());

        Assert.assertEquals("Invalid selection! The ID you chose is not a valid product in our vending machine! \n", vending.selectProduct(20));

        Assert.assertEquals("Not enough credit! Please insert more coins or try another option! \n", vending.selectProduct(6));
    }
}
