package com.myapp.blog.services;

import com.myapp.blog.domain.entities.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getAllTags();
}
