package com.example.userservice.service;

import com.example.userservice.dto.user.UserRequest;
import com.example.userservice.dto.user.UserResponse;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    
    @Override
    public UserResponse.JoinMessage createUser(User user) {
        return null;
    }
}
