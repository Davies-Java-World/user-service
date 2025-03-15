package edu.davies.userService.services;

import edu.davies.userService.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
}
