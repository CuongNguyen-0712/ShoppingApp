package com.backend.server.repository;

import com.backend.server.dto.UserDTO;
import com.backend.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsernameAndPassword(String username, String password);
    Optional<UserDTO> findUserByUsername(String username);
    User findUserById(String id);
}