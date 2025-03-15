package edu.davies.userService.services.impl;

import edu.davies.userService.model.User;
import edu.davies.userService.repository.UserRepository;
import edu.davies.userService.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public User getUserById(Long id){
        return userRepository.getReferenceById(id);
    }
}
