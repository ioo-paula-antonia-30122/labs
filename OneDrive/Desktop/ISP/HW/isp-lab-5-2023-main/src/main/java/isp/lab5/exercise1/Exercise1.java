package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product[] availableProducts = {
                new Product("1", "Mobile Phone", 399.99, ProductCategory.ELECTRONICS),
                new Product("2", "TV", 299.99, ProductCategory.ELECTRONICS),
                new Product("3", "Laptop for Gaming", 599.99, ProductCategory.ELECTRONICS),
                new Product("4", "Refrigerator", 399.99, ProductCategory.ELECTRONICS),
                new Product("5", "Air fryer", 99.99, ProductCategory.ELECTRONICS),

                new Product("6", "T-Shirt", 29.99, ProductCategory.FASHION),
                new Product("7", "Jeans", 39.99, ProductCategory.FASHION),
                new Product("8", "Dress", 49.99, ProductCategory.FASHION),
                new Product("9", "Jacket", 29.99, ProductCategory.FASHION),
                new Product("10", "Skirt", 19.99, ProductCategory.FASHION),

                new Product("11", "Sofa", 499.99, ProductCategory.HOME_AND_GARDEN),
                new Product("12", "Ceramic Vase", 9.99, ProductCategory.HOME_AND_GARDEN),
                new Product("13", "Chair", 19.99, ProductCategory.HOME_AND_GARDEN),
                new Product("14", "Table", 39.99, ProductCategory.HOME_AND_GARDEN),
                new Product("15", "Swing", 99.99, ProductCategory.HOME_AND_GARDEN),

                new Product("16", "Gloss", 25.99, ProductCategory.BEAUTY),
                new Product("17", "Concealer", 9.99, ProductCategory.BEAUTY),
                new Product("18", "Eyeshadow", 19.99, ProductCategory.BEAUTY),
                new Product("19", "Blush", 15.99, ProductCategory.BEAUTY),
                new Product("20", "Highlighter", 9.99, ProductCategory.BEAUTY),

                new Product("21", "Plush", 14.99, ProductCategory.TOYS),
                new Product("22", "Slime", 3.99, ProductCategory.TOYS),
                new Product("23", "Car", 19.99, ProductCategory.TOYS),
                new Product("24", "Princess", 17.99, ProductCategory.TOYS),
                new Product("25", "Lego", 29.99, ProductCategory.TOYS)
        };

        System.out.println("All the available products: ");
        for (int i = 0; i < availableProducts.length; i++) {
            System.out.println(availableProducts[i].toString());
        }

        Address address = new Address("Brasov", "Galaxy Street");
        Customer customer = new Customer("100", "Ioo Paula", "+40756012357", address);
        Order order = new Order("1", LocalDateTime.now(), customer, 0.0);

        System.out.println("Please select only from the available products those you want to buy: (0 means finish)! ");

        boolean add = true;

        while (add) {
            int pick = scanner.nextInt();
            if (pick == 0) {
                add = false;
                System.out.println("Shopping session finished! ");
            } else if (pick <= availableProducts.length && pick >= 1) {
                if (order.getCounter() < 10) {
                    order.addProduct(availableProducts[pick - 1]);
                } else {
                    System.out.println("FULL! We will finish the shopping session! ");
                    add = false;
                }
            } else
                System.out.println("You chose an invalid product number!");
        }

        System.out.println("Products you added in your cart: ");
        for (int i = 0; i < order.getProducts().length; i++) {
            if (order.getProducts()[i] != null)
                System.out.println(order.getProducts()[i]);
        }

        System.out.println("TOTAL: " + order.getTotalPrice());

        System.out.println("Details:" + customer.getCustomerId() + " " + customer.getName() + " " + customer.getPhone() + " " + customer.getAddress());

        System.out.println("Order details: " +order.toString());

        scanner.close();
    }
}
