package com.backend.server.controller;

import com.backend.server.dto.UserDTO;
import com.backend.server.entity.User;
import com.backend.server.service.UserService;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signIn")
    public UserDTO findUser(@RequestBody User data){
        return userService.getUser(data);
    }

    @PostMapping("/signUp")
    public String createUser(@RequestBody User data){
        return userService.setUser(data);
    }
}
