package isp.lab6.exercise3;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private LoginSystem loginSyst;
    private OnlineStore store;

    public UserInterface(LoginSystem loginSyst, OnlineStore store) {
        this.loginSyst = loginSyst;
        this.store = store;
    }

    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        User current = null;

        System.out.println("--Shop shop shop--");

        boolean loading = true;

        while (loading) {
            System.out.println("Available menu. Please make a choice! ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Logout");
            System.out.println("4. List of products");
            System.out.println("5. Sort products");
            System.out.println("6. Add into your cart");
            System.out.println("7. Checkout");
            System.out.println("8. Exit shop");
            System.out.println("Please select a valid option and use NUMBERS: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Username: ");
                    String registrationUsername = scanner.nextLine();
                    System.out.println("Password: ");
                    String registrationPassword = scanner.nextLine();
                    loginSyst.register(registrationUsername, registrationPassword);
                    System.out.println("Yes! Thanks for joining us!");
                    break;

                case "2":
                    if (current != null) {
                        System.out.println("Wow, you are already logged in!");
                        break;
                    }

                    System.out.println("Username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.println("Password: ");
                    String loginPassword = scanner.nextLine();

                    if (loginSyst.login(loginUsername, loginPassword)) {
                        current = new User(loginUsername, loginPassword);
                        store.addSession(current.getUsername());
                        System.out.println("Happy to see you! You are logged in! ");
                    }
                    break;

                case "3":
                    if (current == null) {
                        System.out.println("Please login first!");
                    } else {
                        loginSyst.logout(current.getUsername(), current.getPassword());
                        System.out.println("Sad to see you go! You just logged out! ");
                        current = null;
                    }
                    break;

                case "4":
                    List<Product> productList = store.getProducts();
                    if (productList.isEmpty()) {
                        System.out.println("Shop is empty!");
                    } else {
                        System.out.println("Products: ");
                        for (int i = 0; i < productList.size(); i++) {
                            Product p = productList.get(i);
                            System.out.println(i + 1 + ". " + p.getName());
                        }
                    }
                    break;

                case "5":
                    System.out.println("Sorting criteria: ");
                    System.out.println("1. Name");
                    System.out.println("2. Price");
                    String criteria = scanner.nextLine();

                    List<Product> sorted = store.getProducts();

                    switch (criteria) {
                        case "1":
                            sorted = store.getProductsSorted(Product.name());
                            break;
                        case "2":
                            sorted = store.getProductsSorted(Product.price());
                            break;
                        default:
                            System.out.println("Product only has name&price, so you chose an invalid criteria! ");
                            break;
                    }

                    System.out.println("Displaying sorted products: ");
                    for (int i = 0; i < sorted.size(); i++) {
                        Product p = sorted.get(i);
                        System.out.println(i + 1 + ". " + p.getName());
                    }
                    break;

                case "6":
                    if (current == null) {
                        System.out.println("You must login! ");
                        break;
                    }
                    List<Product> productList1 = store.getProducts();
                    if (productList1.isEmpty()) {
                        System.out.println("Shop is empty!");
                        break;
                    }
                    for (int i = 0; i < productList1.size(); i++) {
                        Product p = productList1.get(i);
                        System.out.println(i + 1 + ". " + p.getName());
                    }

                    System.out.println("Select the product you want (NUMBER): ");
                    int index = Integer.parseInt(scanner.nextLine());
                    if (index <= 0 || index > productList1.size()) {
                        System.out.println("Ups! Invalid product!");
                        break;
                    }
                    System.out.println("Introduce quantity of products: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    store.addToCart(current.getUsername(), productList1.get(index - 1), quantity);
                    System.out.println("Successfully added to your cart! ");
                    break;

                case "7":
                    if (current == null) {
                        System.out.println("You must login to receive the receipt!");
                        break;
                    }

                    String receipt = store.checkout(current.getUsername());
                    System.out.println(receipt);
                    break;

                case "8":
                    if (current != null) {
                        store.removeSession(current.getUsername());
                        System.out.println("Logged out automatically because you are exiting!");
                    }
                    loading = false;
                    System.out.println("Hope to see you again!");
                    break;

                default:
                    System.out.println("INVALID OPTION! Please choose a number from the menu! ");
            }
        }
    }
}