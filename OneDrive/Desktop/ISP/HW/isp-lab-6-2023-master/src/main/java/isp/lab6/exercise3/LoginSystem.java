package isp.lab6.exercise3;

import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    Set<User> users;
    private OnlineStore store;

    public LoginSystem(OnlineStore store) {
        this.users = new HashSet<>();
        this.store = store;
    }

    public void register(String username, String password) {
        User newUser = new User(username, password);
        if (users.add(newUser)) {
            System.out.println("The registration was a success!");
        } else {
            System.out.println("Registration failed! Username is already taken! ");
        }
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Successful login! ");
                return true;
            }
        }
        System.out.println("Might not be registered or typo mistakes! \nDouble check your username and password and try again!");
        return false;
    }

    public boolean logout(String username, String password) {
        boolean logged = login(username, password);
        if(logged){
            System.out.println("Singing you out!");
            return true;
        }
        else{
            System.out.println("You have to login first before logging out!");
            return false;
        }
    }

}
