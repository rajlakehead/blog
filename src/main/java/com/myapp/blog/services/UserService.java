package com.myapp.blog.services;

import com.myapp.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
