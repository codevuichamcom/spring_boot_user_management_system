package com.example.user.service;

import java.util.List;

import com.example.user.entity.User;
import com.example.user.model.dto.UserDTO;

public interface UserService {

    public List<UserDTO> getAllUsers();

    public UserDTO getUserById(int id);

    public UserDTO createUser(User user);

    public UserDTO updateUser(User user);

    public UserDTO deleteUser(int id);

}