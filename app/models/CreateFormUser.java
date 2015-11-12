package models;

import play.data.validation.Constraints;

public class CreateFormUser {

    public CreateFormUser() {

    }
    public CreateFormUser(String userName, String degree, String aboutText) {
        this.userName = userName;
        this.degree = degree;
        this.aboutText = aboutText;
    }

    @Constraints.MinLength(2)
    @Constraints.MaxLength(20)
    @Constraints.Required
    public String userName;

    @Constraints.Required
    public String degree;

    public String aboutText;

}
