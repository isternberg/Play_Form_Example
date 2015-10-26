package models;

import java.util.Arrays;
import java.util.List;

public class UserServiceDummyImpl implements UsersService{


    @Override
    public List<User> getUsers() {
        User user1 = new User("Hans Levi", "Bekleidungstechnik", "Ich rauche, also bin ich.");
        User user2 = new User("Georg Cohen", "Angewandte Informatik", "Ich meditiere, also bin ich nicht.");
        List<User> users = Arrays.asList(user1, user2);
        return users;
    }
}
