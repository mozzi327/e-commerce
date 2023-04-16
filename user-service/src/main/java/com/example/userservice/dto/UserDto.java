package com.example.userservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserDto {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less then two characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name not be less then two characters")
    private String name;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be equal or greater then 8 characters")
    private String password;

    @Builder
    public UserDto(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
