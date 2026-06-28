package com.rafael.blogging.post.records;

public record PostDto(
        Long id,
        String title,
        String content,
        String authorUsername) {
}
