package by.tms.servlet.registration;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage {

    public InMemoryStorage() {
    }

    private final List<User> users = new ArrayList<>();

    public void createNewUser(String name, String userName, String password) {
        users.add(new User(name, userName, password));
    }

    public boolean isExists(User user) {
        if (users.contains(user)) {
            return false;
        }
        return true;
    }

    public String display(User user) {
        if (isExists(user)) {
            System.out.println("Exists");
        }
        return user.toString();
    }

}
