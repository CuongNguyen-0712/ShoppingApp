package com.backend.server.dto;

import lombok.Data;

@Data
public class UserToSignIn {
    String username;
    String password;
}
