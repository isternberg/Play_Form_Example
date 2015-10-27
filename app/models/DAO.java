package models;

import com.avaje.ebean.Model;

import java.util.List;

public class DAO {

    public static Model.Finder<Long,User> find = new Model.Finder<Long,User>(
            Long.class, User.class
    );

    public static List<User> all() {
        return find.all();
    }

    public static void create(User user) {
        user.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }



}
