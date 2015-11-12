package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User extends Model {
    public User() {

    }
    public User(String userName, String degree, String aboutText) {
        this.userName = userName;
        this.degree = degree;
        this.aboutText = aboutText;
    }

    @Id
    public Long id;

    public String userName;

    public String degree;

    public String aboutText;


}
