package com.backend.server.dto;

import lombok.*;

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
}
