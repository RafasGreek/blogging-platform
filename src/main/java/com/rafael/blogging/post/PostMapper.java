package com.rafael.blogging.post;

import com.rafael.blogging.post.records.PostDto;
import org.mapstruct.Mapper;

@Mapper
public class PostMapper {
    PostDto toPostDto(Post post) {
        return new PostDto(post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getAuthor().getUsername());
    }
}
