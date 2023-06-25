package main.java.seminar4.service;

import src.main.java.seminar4.model.Student;
import src.main.java.seminar4.model.User;
import src.main.java.seminar4.repository.StudentRepository;
import src.main.java.seminar4.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber);
        studentRepository.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllUsersSortedByFirstName() {
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);

        return students;
    }

    @Override
    public List<Student> getAllUsersSortedByLastName() {
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparator<>());

        return students;
    }

    @Override
    public List<Student> getAllUsersSortedByAge() {
        List<Student> students = studentRepository.getAll();

//  Реализация компаратора через анонимный класс
//        students.sort((new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge().compareTo(o2.getAge());
//            }
//        }));

//  Реализация компаратора через лямбда выражение
//        students.sort(((o1, o2) -> o1.getAge().compareTo(o2.getAge())));

//  Реализация компаратора через указатель
        students.sort((Comparator.comparing(User::getAge)));

        return students;
    }

    @Override
    public void removeUser(String fullName) {
        studentRepository.remove(fullName);
    }
}
