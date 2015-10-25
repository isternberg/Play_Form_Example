package controllers;

import model.DegreesService;
import model.User;
import play.Logger;
import play.Routes;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.create;

import javax.inject.Inject;

public class CreateUserController extends Controller {

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
//        if (true){
//            userForm.reject(Messages.get("login.data.wrong"));
//            return badRequest(create.render(userForm));
//        }
        User createdUser = userForm.get();
        flash("success", Messages.get("user.successful.created"));
        return redirect(routes.CreateUserController.render());
    }

}
