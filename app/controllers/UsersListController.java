package controllers;

import com.google.inject.Inject;
import models.User;
import models.UsersService;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usersList;

public class UsersListController extends Controller{

    @Inject
    UsersService usersService;

    public Result render(){

        for (User u : User.all()){
            Logger.debug(u.userName);
        }
        return ok(usersList.render(User.all()));
    }

}
