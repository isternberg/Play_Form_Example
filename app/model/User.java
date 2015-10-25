package model;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;


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




}
