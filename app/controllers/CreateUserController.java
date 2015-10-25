package controllers;

import model.User;
import play.Logger;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.create;

public class CreateUserController extends Controller {

    private static final Form<User> USER_FORM = Form.form(User.class);


    public Result render(){

        return ok(create.render(USER_FORM));
    }

    public Result doCreateUser(){
        Form<User> userForm = USER_FORM.bindFromRequest();
        if (userForm.hasErrors()) {
            Logger.error("a user could not be created.");
            return badRequest(create.render(userForm));
        }
        flash("success", Messages.get("user.successful.created"));
        return ok(create.render(USER_FORM));
    }

}
