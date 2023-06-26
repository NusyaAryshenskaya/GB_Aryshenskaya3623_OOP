package main.java.homework4;

import main.java.homework4.controller.StudentController;
import main.java.homework4.controller.TeacherController;
import main.java.homework4.repository.StudentRepository;
import main.java.homework4.repository.TeacherRepository;
import main.java.homework4.service.StudentService;
import main.java.homework4.service.TeacherService;
import main.java.homework4.view.SortType;
import main.java.homework4.view.StudentView;
import main.java.homework4.view.TeacherView;


public class Main {
    public static void main(String[] args) {
        StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();


        studentView.create("Валентин Сидоров", 18, "334-4343");
        studentView.create("Полина Потапова", 19, "576-7676");
        studentView.create("Вероника Потапова", 17, "576-7676");
        studentView.create("Федор Максимов", 20, "456-4554");
        studentView.create("Павел Гержой", 17, "789-9878");
        studentView.create("Вероника Сорокина", 18, "908-0880");

        studentView.sendOnConsole(SortType.AGE);

        teacherView.create("Валерий Федулкин", 32, "212-1221");
        teacherView.create("Маргарита Петрова", 38, "212-1315");
        teacherView.create("Сергей Подмосковный", 34, "345-4565");
        teacherView.create("Эльмира Ризванова", 37, "765-5656");
        teacherView.create("Милолика Пикарская", 40, "978-7878");
        teacherView.create("Софья Салтыкова", 35, "901-2353");
        teacherView.sendOnConsole(SortType.ID);

        teacherView.edit("Софья Салтыкова", 33, "901-2353");
        teacherView.sendOnConsole(SortType.ID);

        studentView.edit("Федор Максимов", 25, "456-4554");
        studentView.edit("Полина Иванова", 18, "776-7676");
        studentView.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
