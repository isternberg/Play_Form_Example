package helpers;

import models.CreateFormUser;
import models.User;

public class UserHelper {

    public User mapUserFromForm(CreateFormUser createFormUser) {
        return new User(createFormUser.userName, createFormUser.degree, createFormUser.aboutText);
    }

}
