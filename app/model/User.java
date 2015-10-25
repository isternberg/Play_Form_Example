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

    @Constraints.Required
    public String userName;

    public String aboutText;


}
