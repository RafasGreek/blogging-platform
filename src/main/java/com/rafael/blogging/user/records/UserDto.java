package com.rafael.blogging.user.records;

public record UserDto(
        Long id,
        String username,
        String email) {
}
