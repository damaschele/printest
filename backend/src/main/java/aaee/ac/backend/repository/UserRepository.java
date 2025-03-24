package aaee.ac.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import aaee.ac.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
}