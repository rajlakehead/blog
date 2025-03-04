package com.myapp.blog.mappers;


import com.myapp.blog.domain.CreatePostRequest;
import com.myapp.blog.domain.UpdatePostRequest;
import com.myapp.blog.domain.dtos.CreatePostRequestDto;
import com.myapp.blog.domain.dtos.PostDto;
import com.myapp.blog.domain.dtos.UpdatePostRequestDto;
import com.myapp.blog.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);


}
