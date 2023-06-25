package main.java.seminar4;

import main.java.seminar4.controller.StudentController;
import main.java.seminar4.repository.StudentRepository;
import main.java.seminar4.service.StudentService;
import main.java.seminar4.view.SortType;
import main.java.seminar4.view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();

        view.create("Иван Федоров", 19, "343-4343");
        view.create("Полина Иванова", 18, "576-7676");
        view.create("Феофан Сидоров", 20, "456-4554");
        view.sendOnConsole(SortType.NONE);
        view.create("Терентий Попов", 17, "789-9878");
        view.create("Евлампия Субботина", 18, "908-0880");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.FIRSTNAME);
        view.sendOnConsole(SortType.LASTNAME);
        view.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }
}
