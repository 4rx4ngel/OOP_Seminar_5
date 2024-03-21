package service;

import data.Student;
import data.Teacher;
import data.User;

import java.util.ArrayList;

public class DataService {

    private ArrayList<User> studentList = new ArrayList<>();
    private ArrayList<User> teacherList = new ArrayList<>();

    public void createUser(User user) {
        if (user instanceof Student) {
            Student student = new Student(user.getFullName(), user.getYearOfBirth(), user.getAddress(),
                    studentList.size() + 1);
            studentList.add(student);
        } else {
            Teacher teacher = new Teacher(user.getFullName(), user.getYearOfBirth(), user.getAddress(),
                    teacherList.size() + 1);
            teacherList.add(teacher);
        }
    }

    public ArrayList<User> readUser(String type) {
        if (type.equals("Student")) {
            return studentList;
        }
        return teacherList;

    }
}
