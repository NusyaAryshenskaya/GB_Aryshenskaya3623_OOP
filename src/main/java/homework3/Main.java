package main.java.homework3;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);

        System.out.println("\nСписок без сортировки:");
        controller.addStudent(new Student(4L, "Алексей Сидоров"));
        controller.addStudent(new Student(6L, "Полина Федулова"));
        controller.addStudent(new Student(2L, "Даниил Вотяков"));
        controller.addStudent(new Student(1L, "Вдадимир Поясов"));
        controller.addStudent(new Student(8L, "Татьяна Селиванова"));
        controller.printAll();

        System.out.println("\nСортировка по имени:");
        controller.sortByFirstName();
        controller.printAll();

        System.out.println("\nСортировка по фамилии:");
        controller.sortByLastName();
        controller.printAll();

    }
}
