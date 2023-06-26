package main.java.homework4.service;

import main.java.homework4.model.Teacher;
import main.java.homework4.model.User;
import main.java.homework4.repository.TeacherRepository;
import main.java.homework4.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("(Создать:) "+fullName+ " <- запись уже существует");
                return;
            }
        }
        Long id = teacherRepository.getMaxId() + 1;
        Teacher teacher = new Teacher(id, fullName, age, phoneNumber);
        teacherRepository.add(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }

    @Override
    public List<Teacher> getAllUsersSortedByFirstName() {
        List<Teacher> teachers = teacherRepository.getAll();
        Collections.sort(teachers);

        return teachers;
    }

    @Override
    public List<Teacher> getAllUsersSortedByLastName() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort(new UserComparator<>());

        return teachers;
    }

    @Override
    public List<Teacher> getAllUsersSortedByAge() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort((Comparator.comparing(User::getAge)));

        return teachers;
    }

    @Override
    public List<Teacher> getAllUsersSortedById() {
        List<Teacher> teachers = teacherRepository.getAll();
        teachers.sort((Comparator.comparing(User::getId)));

        return teachers;
    }

    @Override
    public void remove(String fullName) {
        teacherRepository.remove(fullName);
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        for (Teacher teacher : teacherRepository.getAll()) {
            if (teacher.getFullName().equals(fullName)) {
                System.out.println("(Редактировать:)'"+fullName+ "' <- запись найдена");
                System.out.println("(Редактировать:) *поля возраст и номер телефона  обновлены*");
                Long id = teacher.getId();
                teacherRepository.remove(fullName);
                Teacher editedTeacher = new Teacher(id, fullName, age, phoneNumber);
                teacherRepository.add(editedTeacher);
                return;
            }
        }
        System.out.println("(Редактировать:)  "+fullName+ " <- запись не найдена");
    }
}
