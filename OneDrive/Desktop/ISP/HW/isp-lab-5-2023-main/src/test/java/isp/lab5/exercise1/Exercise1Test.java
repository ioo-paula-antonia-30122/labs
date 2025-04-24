package isp.lab5.exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @author Radu Miron
 * @version 1
 */
public class Exercise1Test {

    @Test
    public void testAddProducts() {
        Product[] products = {
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
        };

        Address address = new Address("Brasov", "Galaxy Street");
        Customer customer = new Customer("100", "Ioo Paula", "+40756012357", address);
        Order order = new Order("1", LocalDateTime.now(), customer, 0.0);

        order.addProduct(products[1]);
        order.addProduct(products[2]);
        order.addProduct(products[3]);
        order.addProduct(products[4]);
        order.addProduct(products[5]);
        order.addProduct(products[6]);

        int counter=0;
        for (Product product : order.getProducts()) {
            if (product != null) {
                order.getProducts();
                counter++;
            }
        }

        order.addProduct(products[0]);
        order.addProduct(products[4]);
        order.addProduct(products[5]);
        order.addProduct(products[6]);

        int counter1=0;
        for (Product product : order.getProducts()) {
            if (product != null) {
                counter1++;
            }
        }
        Assert.assertEquals(10,counter1);

        Assert.assertFalse(order.addProduct(products[7]));


    }
}
