package ru.kata.spring.boot_security.demo.service;




import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);


    void updateUser(Long id, User updatedUser);
}
