package com.backend.server.mapper;

import com.backend.server.dto.UserDTO;
import com.backend.server.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDTO toDTO(User user) {
        if (user == null) return null;

        return UserDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .name(user.getName())
                .phone(user.getPhone())
                .address(user.getAddress())
                .build();
    }

}
