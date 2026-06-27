package com.rafael.blogging.user;

import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public UserDto toDto(User user) {
        return new UserDto(user.getId(),
                user.getUsername(),
                user.getEmail());
    }
}
