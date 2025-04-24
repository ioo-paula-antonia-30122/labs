package isp.lab3.exercise6;

import isp.lab3.exercise5.VendingMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VendingMachine1 {
    public static VendingMachine1 instance;
    private Map<Integer, String> productNames;
    private Map<Integer, Integer> productPrices;
    private int credit;

    public VendingMachine1() {
        productNames = new HashMap<>();
        productPrices = new HashMap<>();
        credit = 0;

        productNames.put(1, "Coca-Cola");
        productPrices.put(1, 6);

        productNames.put(2, "Fibrobar-R");
        productPrices.put(2, 4);

        productNames.put(3, "Apa minerala");
        productPrices.put(3, 3);

        productNames.put(4, "Apa plata");
        productPrices.put(4, 3);

        productNames.put(5, "Cappy");
        productPrices.put(5, 6);

        productNames.put(6, "Sprite");
        productPrices.put(6, 6);

        productNames.put(7, "Chipsuri");
        productPrices.put(7, 10);

        productNames.put(8, "Sandwich");
        productPrices.put(8, 15);

        productNames.put(9, "Cafea doza");
        productPrices.put(9, 5);

        productNames.put(10, "Saratele");
        productPrices.put(10, 7);
    }

    public static synchronized VendingMachine1 getInstance() {
        if (instance == null) {
            synchronized (VendingMachine1.class) {
                if (instance == null)
                    instance = new VendingMachine1();
            }
        }

        return instance;
    }

    protected VendingMachine1(int credit) {
        this.credit = credit;
    }

    public void displayProducts() {
        System.out.println("Available Products: \n");
        Set<Integer> productID = productNames.keySet();

        Integer[] ID = productID.toArray(new Integer[0]);

        for (int i = 0; i < ID.length; i++) {
            int id = ID[i];
            String name = productNames.get(id);
            int price = productPrices.get(id);
            System.out.println("ID: " + id + " --- " + name + " " + price + " RON");
        }

    }

    public void insertCoin(int value) {
        if (value > 0 && (value == 1 || value == 5 || value == 10)) {
            credit = credit + value;
            System.out.println("Inserted: " + value + " RON \n Credit: " + credit + " RON \n");
        } else
            System.out.println("Invalid value! You must enter a positive value and bill --- 1,5,10 RON! \n");
    }

    public String selectProduct(int id) {
        if (productNames.containsKey(id)) {
            int price = productPrices.get(id);
            if (credit >= price) {
                credit = credit - price;
                return "Product: " + productNames.get(id) + " is on its way! \n";
            } else
                return "Not enough credit! Please insert more coins or try another option! \n";
        } else
            return "Invalid selection! The ID you chose is not a valid product in our vending machine! \n";

    }

    public void displayCredit() {
        System.out.println("Credit: " + credit + " RON");
    }

    public void userMenu() {
        System.out.println("-----VENDING MACHINE----- ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: \n");
            System.out.println("1. List of products ");
            System.out.println("2. Insert coins (NO RETURNS! PLEASE INSERT THE EXACT AMOUNT FOR THE PRODUCT) ");
            System.out.println("3. Select product ");
            System.out.println("4. Credit remained ");
            System.out.println("5. Exit \n");

            System.out.println("Make a pick: ");
            int pick = scanner.nextInt();

            switch (pick) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.println("Enter value you want to introduce --- You can introduce 1, 5, 10 RON: ");
                    int coin = scanner.nextInt();
                    insertCoin(coin);
                    break;
                case 3:
                    System.out.println("Enter the ID of product you want : ");
                    int productID = scanner.nextInt();
                    System.out.println(selectProduct(productID));
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    System.out.println("Thanks for choosing our vending machine! Have a nice day! Bye bye! :) ");
                    scanner.close();
                    return;
                default:
                    System.out.println("You chose an invalid option! Please choose between 1-5! Thank you! ");
            }
        }
    }
}
