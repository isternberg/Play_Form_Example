package controllers;

import model.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.userCreate;

public class CreateUserController extends Controller {

    private static final Form<User> USER_FORM = Form.form(User.class);


    public Result render(){

        return ok(userCreate.render(USER_FORM));
    }

    public Result doCreateUser(){

        return ok();
    }

}
