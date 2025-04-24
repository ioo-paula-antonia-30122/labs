package isp.lab6.exercise3;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise3 {

    public static void main(String[] args) {
        List<Product> productsAvailable = new ArrayList<>();

        Product p = new Product("Water", 1.99);
        Product p1 = new Product("Coca-Cola", 2.99);
        Product p2 = new Product("Bubblegum", 0.99);
        Product p3 = new Product("Yogurt", 1.49);
        Product p4 = new Product("Almond Milk", 2.49);

        productsAvailable.add(p);
        productsAvailable.add(p1);
        productsAvailable.add(p2);
        productsAvailable.add(p3);
        productsAvailable.add(p4);

        Map<String, ActiveSession> sessions = new HashMap<>();

        OnlineStore store = new OnlineStore(productsAvailable, sessions);

        LoginSystem loginSystem = new LoginSystem(store);

        UserInterface interface1 = new UserInterface(loginSystem, store);

        interface1.loadInterface();

    }
}
