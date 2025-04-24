package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private Customer customer;
    private Product[] products = new Product[10];
    private int counter = 0;

    public Order(String orderId, LocalDateTime date, Customer customer, double totalPrice) {
        this.orderId = orderId;
        this.date = date;
        this.customer = customer;
        this.totalPrice = 0;
    }

    public boolean addProduct(Product product) {
        if (counter < 10) {
            this.products[counter] = product;
            counter++;
            totalPrice = totalPrice + product.getPrice();
            return true;
        } else {
            System.out.println("FULL!");
            return false;
        }

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Order {" +
                "orderId='" + orderId + '\'' +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", customer=" + customer +
                '}';
    }
}
