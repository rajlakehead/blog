package com.myapp.blog.services.impl;

import com.myapp.blog.domain.entities.Tag;
import com.myapp.blog.repositories.TagRepository;
import com.myapp.blog.services.TagService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    @Override
    @Transactional
    public List<Tag> getAllTags() {
        return tagRepository.findAllWithPostCount();
    }
}