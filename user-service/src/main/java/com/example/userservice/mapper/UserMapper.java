package com.example.userservice.mapper;

import com.example.userservice.dto.user.UserRequest;
import com.example.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    User JoinUserToEntity(UserRequest.Join joinUser);
}
