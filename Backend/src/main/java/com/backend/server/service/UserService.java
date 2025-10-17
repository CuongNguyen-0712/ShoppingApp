package com.backend.server.service;

import com.backend.server.dto.UserToSignIn;
import com.backend.server.entity.User;
import com.backend.server.dto.UserDTO;
import com.backend.server.mapper.UserMapper;
import com.backend.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

    @Service
    @RequiredArgsConstructor
    public class UserService {
        private final UserRepository userRepository;

        public UserDTO getUser(UserToSignIn data){
            Optional<User> optionalUser = userRepository.findUserByUsernameAndPassword(data.getUsername(), data.getPassword());
            if(optionalUser.isPresent()){
                User user = optionalUser.get();
                return UserMapper.toDTO(user);
            }

            return null;
        }

        public String setUser(User data){
            Optional<User> result = userRepository.findUserByUsername(data.getUsername());

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

        public UserDTO getInfo(String id){
            User user = userRepository.findUserById(id);
            return UserMapper.toDTO(user);
        }

        public String update(UserDTO data){
            try{
                User user = userRepository.findUserById(data.getId());

                user.setUsername(data.getUsername());
                user.setName(data.getName());
                user.setPhone(data.getPhone());
                user.setAddress(data.getAddress());
                user.setUpdatedAt(LocalDateTime.now());

                userRepository.save(user);

                return "Update information successfully";
            }
            catch (Exception e){
                return "Something is error: " + e.getMessage();
            }
        }
    }

