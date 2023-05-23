package org.tech_pod.services;
import org.tech_pod.model.Event;
import org.tech_pod.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech_pod.model.User;

import java.util.List;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User createUser(User user) {
        userRepository.save(user);
        return user; }

    public User updateUser(Long id, User user) {
        User updatedUser = userRepository.findById(id).get();
        return updatedUser;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
