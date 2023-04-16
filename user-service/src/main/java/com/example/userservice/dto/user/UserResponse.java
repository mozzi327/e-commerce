package com.example.userservice.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserResponse {

    @Getter
    @NoArgsConstructor
    public static class JoinMessage {
        private String email;
        private String name;
        private String userId;

        @Builder
        public JoinMessage(String email, String name, String userId) {
            this.email = email;
            this.name = name;
            this.userId = userId;
        }
    }
}
