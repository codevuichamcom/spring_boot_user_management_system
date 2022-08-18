package com.example.user.model.mapper;

import com.example.user.entity.User;
import com.example.user.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setAge(user.getAge());
        userDTO.setPhone(user.getPhone());
        return userDTO;
    }
}
