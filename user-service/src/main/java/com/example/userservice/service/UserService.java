package com.example.userservice.service;

import com.example.userservice.dto.user.UserResponse;
import com.example.userservice.entity.User;

public interface UserService {
    UserResponse.JoinMessage createUser(User user);
}
