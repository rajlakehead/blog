package com.myapp.blog.services;

import com.myapp.blog.domain.entities.Tag;

import java.util.List;
import java.util.Set;

public interface TagService {
    List<Tag> getAllTags();

    List<Tag> createTags(Set<String> tagNames);
}
