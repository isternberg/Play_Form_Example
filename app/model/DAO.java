package model;

import com.avaje.ebean.Model;

import java.util.List;

public class DAO {

    public static Model.Finder<Long,User> find = new Model.Finder<Long,User>(
            Long.class, User.class
    );

    public static List<User> getUsers(){
        List<User> users= DAO.find.all();
        return users;
    }


}
