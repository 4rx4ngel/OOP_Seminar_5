import controller.Controller;
import data.Student;
import data.Teacher;
import view.StudentView;
import view.TeacherView;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов Иван Иванович", 1994, "Красноярск",0);
        Student student2 = new Student("Петров Петр Петрович", 1995, "Красноярск",0);
        Teacher teacher1 = new Teacher("Семенов Семен Семенович", 1980, "Питер",0);
        Teacher teacher2 = new Teacher("Янковский Иван Олегович", 1975, "Москва",0);

        Controller controller = new Controller();
        controller.create(student1);
        controller.create(student2);
        controller.create(teacher1);
        controller.create(teacher2);
        StudentView studentView = new StudentView(controller);
        studentView.readStudent();
        TeacherView teacherView = new TeacherView(controller);
        teacherView.readTeacher();
    }

}