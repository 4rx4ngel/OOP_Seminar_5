package view;

import controller.Controller;

public class StudentView {
    private Controller controller;

    public StudentView(Controller controller) {
        this.controller = controller;
    }

    public void readStudent() {
        System.out.println(controller.read("Student"));
    }
}
