package com.backend.server.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String id;
    private String username;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
