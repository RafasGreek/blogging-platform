package com.rafael.blogging.user;

public record UserDto(
        Long id,
        String username,
        String email) {
}
