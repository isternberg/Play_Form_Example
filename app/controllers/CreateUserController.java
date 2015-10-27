package controllers;

import helpers.FormValidator;
import models.DAO;
import models.DegreesService;
import models.User;
import play.Logger;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.create;

import javax.inject.Inject;

public class CreateUserController extends Controller {

    public static final String MIN_USERNAME_LENGTH = " 2-";

    @Inject
    DegreesService degreesService;

    private static final Form<User> USER_FORM = Form.form(User.class);


    public Result render(){

        return ok(create.render(USER_FORM, degreesService.getDegrees()));
    }

    public Result doCreateUser(){
        Form<User> userForm = USER_FORM.bindFromRequest();
        if (userForm.hasErrors()) {
            Logger.error("a user could not be created.");
            return badRequest(create.render(userForm, degreesService.getDegrees()));
        }
        User createdUser = userForm.get();
        if (!FormValidator.validateInputLength(createdUser.userName)){
            userForm.reject(Messages.get("user.create.username.length.error.begin") + MIN_USERNAME_LENGTH
                    + Messages.get("user.create.username.length.error.end"));
            return badRequest(create.render(userForm, degreesService.getDegrees()));
        }
        DAO.create(createdUser);
        flash("success", Messages.get("user.successful.created"));
        return redirect(routes.CreateUserController.render());
    }

}
