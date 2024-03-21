package controller;

import data.Student;
import data.User;
import service.DataService;

import java.util.ArrayList;

public class Controller {
    private DataService dataService = new DataService();
    public void create(User user) {
        dataService.createUser(user);
    }
    public ArrayList<User> read (String type) {
        return dataService.readUser(type);
    }
}
