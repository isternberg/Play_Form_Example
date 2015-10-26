package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;
import javax.persistence.*;
import java.util.List;


@Entity
public class User extends Model {
    @Id
    @Constraints.Min(10)
    public Long id;

    public User() {

    }
    public User(String userName, String degree, String aboutText) {
        this.userName = userName;
        this.degree = degree;
        this.aboutText = aboutText;
    }

    @Constraints.Required
    public String userName;

    @Constraints.Required
    public String degree;

    public String aboutText;

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
