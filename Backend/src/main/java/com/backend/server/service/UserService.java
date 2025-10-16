package com.backend.server.service;

import com.backend.server.entity.User;
import com.backend.server.dto.UserDTO;
import com.backend.server.mapper.UserMapper;
import com.backend.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

    @Service
    @RequiredArgsConstructor
    public class UserService {
        private final UserRepository userRepository;
        private final UserMapper userMapper;

        public UserDTO getUser(User data){
            Optional<User> optionalUser = userRepository.findUserByUsernameAndPassword(data.getUsername(), data.getPassword());
            if(optionalUser.isPresent()){
                User user = optionalUser.get();
                return userMapper.toDTO(user);
            }

            return null;
        }

        public String setUser(User data){
            Optional<UserDTO> result = userRepository.findUserByUsername(data.getUsername());

            if(result.isPresent()){
                return "Username has been used";
            }

            try{
                userRepository.save(data);
                return "Create account successfully";
            }catch (Exception e){
                return "Something is error: " + e.getMessage();
            }
        }
    }

