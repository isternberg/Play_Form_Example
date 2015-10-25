package controllers;

import com.google.inject.Inject;
import model.UsersService;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class UsersList extends Controller{

    @Inject
    UsersService usersService;

    public Result render(){

        return ok(usersList.render(usersService.getUsers()));
    }

}
