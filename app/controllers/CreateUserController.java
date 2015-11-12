package controllers;

import helpers.UserHelper;
import models.CreateFormUser;
import models.DegreeService;
import models.User;
import models.UserService;
import play.Logger;
import play.data.Form;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import javax.inject.Inject;

public class CreateUserController extends Controller {


    @Inject
    DegreeService degreesService;

    @Inject
    UserService userService;

    @Inject
    UserHelper userHelper;

    private static final Form<CreateFormUser> USER_FORM = Form.form(CreateFormUser.class);


    public Result render(){

        return ok(create.render(USER_FORM, degreesService.getDegrees()));
    }

    public Result doCreateUser(){
        Form<CreateFormUser> userForm = USER_FORM.bindFromRequest();
        if (userForm.hasErrors()) {
            Logger.error("a user could not be created.");
            return badRequest(create.render(userForm, degreesService.getDegrees()));
        }
        CreateFormUser createFormUser = userForm.get();
        User newUser = userHelper.mapUserFromForm(createFormUser);
        userService.create(newUser);
        flash("success", Messages.get("user.successful.created"));
        return redirect(routes.CreateUserController.render());
    }



}
