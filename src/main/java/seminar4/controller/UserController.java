package main.java.seminar4.controller;

import src.main.java.seminar4.model.User;

import java.util.List;

public interface UserController<T extends User>  {

    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAllUsersSortedByFirstName();
    List<T> getAllUsersSortedByLastName();
    List<T> getAllUsersSortedByAge();
    boolean removeUser(String fullName);
    List<T> getAll();


}
