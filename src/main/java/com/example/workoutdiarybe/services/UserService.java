package com.example.workoutdiarybe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workoutdiarybe.exception.UserNotFoundException;
import com.example.workoutdiarybe.model.User;
import com.example.workoutdiarybe.repo.UserRepo;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    
    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Transactional
    public void deleteUser(Long id) {
         userRepo.deleteUserById(id);
    }
}
