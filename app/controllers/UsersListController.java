package controllers;

import models.DAO;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usersList;

public class UsersListController extends Controller{


    public Result render(){
        return ok(usersList.render(DAO.all()));
    }

}
