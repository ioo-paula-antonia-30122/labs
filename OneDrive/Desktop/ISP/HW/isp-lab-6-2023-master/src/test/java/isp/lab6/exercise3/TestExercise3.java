package isp.lab6.exercise3;

import org.junit.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExercise3 {

    @Test
    public void testRegistration() {
        Product product = new Product("Ice-cream", 2.99);
        Product product1 = new Product("Coca-Cola", 0.99);
        List<Product> prod = new ArrayList<>();
        prod.add(product);
        prod.add(product1);

        Map<String, ActiveSession> sessionMap = new HashMap<>();

        OnlineStore store = new OnlineStore(prod, sessionMap);

        LoginSystem loginSystem = new LoginSystem(store);

        User user = new User("Paula", "1234");

        loginSystem.register(user.getUsername(), user.getPassword());
        store.addSession(user.getUsername());

        Assert.assertTrue(loginSystem.login(user.getUsername(), user.getPassword()));
    }


    @Test
    public void testLoginAndLogoutAndRemoveSession() {
        Product product = new Product("Ice-cream", 2.99);
        Product product1 = new Product("Coca-Cola", 0.99);
        List<Product> prod = new ArrayList<>();
        prod.add(product);
        prod.add(product1);
        Map<String, ActiveSession> sessionMap = new HashMap<>();

        OnlineStore store = new OnlineStore(prod, sessionMap);

        LoginSystem loginSystem = new LoginSystem(store);

        User user = new User("Paula", "1234");

        loginSystem.register(user.getUsername(), user.getPassword());
        loginSystem.login(user.getUsername(), user.getPassword());

        store.addSession(user.getUsername());

        Assert.assertTrue(loginSystem.login(user.getUsername(), user.getPassword()));

        Assert.assertTrue(loginSystem.logout(user.getUsername(), user.getPassword()));

        Assert.assertFalse(loginSystem.logout(user.getUsername(), user.getUsername()));

        store.removeSession(user.getUsername());
        Assert.assertNull(sessionMap.get(user.getUsername()));
    }

    @Test
    public void testAddToCartAndCheckout() {
        Product product = new Product("Ice-cream", 2.99);
        Product product1 = new Product("Coca-Cola", 0.99);
        List<Product> prod = new ArrayList<>();
        prod.add(product);
        prod.add(product1);

        Map<String, ActiveSession> sessionMap = new HashMap<>();

        OnlineStore store = new OnlineStore(prod, sessionMap);

        LoginSystem loginSystem = new LoginSystem(store);

        User user = new User("Paula", "1234");

        loginSystem.register(user.getUsername(), user.getPassword());
        loginSystem.login(user.getUsername(), user.getPassword());
        store.addSession(user.getUsername());

        store.addToCart(user.getUsername(), product, 3);

        Assert.assertEquals(1, sessionMap.get("Paula").getShoppingCart().size());

        String receipt = store.checkout(user.getUsername());

        Assert.assertTrue(receipt.contains("Ice-cream * 3 = 8.97\nTotal: 8.97"));
    }
}
