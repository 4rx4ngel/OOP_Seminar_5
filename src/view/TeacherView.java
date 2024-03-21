package view;

import controller.Controller;
import data.Teacher;

public class TeacherView {
    private Controller controller;

    public TeacherView(Controller controller) {
        this.controller = controller;
    }

    public void readTeacher() {
        System.out.println(controller.read("Teacher"));
    }
}
