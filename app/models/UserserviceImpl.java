package models;

import com.avaje.ebean.Model;

import java.util.List;

public class UserserviceImpl implements  UserService{

    public static Model.Finder<Long,User> find = new Model.Finder<Long,User>(
            Long.class, User.class
    );

    public List<User> getAllUsers() {
        return find.all();
    }

    public void create(User user) {
        user.save();
    }

    public void delete(Long id) {
        find.ref(id).delete();
    }



}
