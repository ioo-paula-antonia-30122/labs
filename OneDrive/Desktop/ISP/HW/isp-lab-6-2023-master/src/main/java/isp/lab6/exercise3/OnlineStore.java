package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public OnlineStore(List<Product> products, Map<String, ActiveSession> sessions) {
        this.products = products;
        this.sessions = sessions;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        List<Product> sortedProducts = new ArrayList<>(products);
        sortedProducts.sort(sortCriteria);
        return sortedProducts;
    }

    public void addSession(String username) {
        sessions.put(username, new ActiveSession(username));
    }

    public void removeSession(String username) {
        sessions.remove(username);
    }

    public void addToCart(String username, Product product, int quantity) {
        ActiveSession session = sessions.get(username);
        if (session != null) {
            session.addToCart(product, quantity);
        }
    }

    public String checkout(String username) {
        ActiveSession session = sessions.get(username);
        if (session == null) {
            return "There is no active session!";
        }

        double totalCost = 0;
        String receipt = "Receipt: ";

        for (Map.Entry<Product, Integer> entry : session.getShoppingCart().entrySet()) {
            double costPerSetOfProducts = entry.getKey().getPrice() * entry.getValue();
            totalCost = totalCost + costPerSetOfProducts;
            receipt = receipt + entry.getKey().getName() + " * " + entry.getValue() + " = " + costPerSetOfProducts + "\n";
        }

        receipt = receipt + "Total: " + totalCost;
        return receipt;

    }
}
