package main.java.seminar4.service;

import src.main.java.seminar4.model.User;

import java.util.List;

public interface UserService<T extends User> {

    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllUsersSortedByFirstName();
    List<T> getAllUsersSortedByLastName();
    List<T> getAllUsersSortedByAge();
    void removeUser(String fullName);

}
