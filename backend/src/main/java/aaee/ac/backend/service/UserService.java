package aaee.ac.backend.service;

import org.springframework.stereotype.Service;

import aaee.ac.backend.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean validateLogin(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password).isPresent();
    }
}