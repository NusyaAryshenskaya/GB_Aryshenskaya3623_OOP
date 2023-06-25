package main.java.seminar4.view;

import main.java.seminar4.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(String sortType);  // GET request
    void create(String fullName, Integer age, String phoneNumber);  // POST request
    void removeUser(String fullName);  // DELETE request
    // PUT request - in case of editing
}
