package controllers;

import models.UserService;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usersList;

import javax.inject.Inject;


public class UsersListController extends Controller{

    @Inject
    UserService userService;

    public Result render(){
        return ok(usersList.render(userService.getAllUsers()));
    }

}
