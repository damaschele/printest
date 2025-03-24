package aaee.ac.backend.service;

import org.springframework.stereotype.Service;

import aaee.ac.backend.model.User;
import aaee.ac.backend.repository.UserRepository;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String email, String password) {
        User user = userRepository.findByEmail(email);
        
        return user != null && user.getPassword().equals(password);
    }
}