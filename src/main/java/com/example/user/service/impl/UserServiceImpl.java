package com.example.user.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.model.dto.UserDTO;
import com.example.user.model.mapper.UserMapper;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userDTOs = new ArrayList<>();
        List<User> users = this.userRepository.findAll();
        for (User user : users) {
            userDTOs.add(UserMapper.toUserDTO(user));
        }
        return userDTOs;
    }

    @Override
    public UserDTO getUserById(int id) {
        User user = this.userRepository.findById(id).get();
        return UserMapper.toUserDTO(user);
    }

    @Override
    public UserDTO createUser(User user) {
        return UserMapper.toUserDTO(this.userRepository.save(user));
    }

    @Override
    public UserDTO updateUser(User user) {
        return UserMapper.toUserDTO(this.userRepository.save(user));
    }

    @Override
    public UserDTO deleteUser(int id) {

        User user = userRepository.findById(id).get();
        if (user != null) {
            userRepository.delete(user);
        }
        return UserMapper.toUserDTO(user);
    }

}
