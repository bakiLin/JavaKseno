package com.mirea.bakiev.service;

import com.mirea.bakiev.controller.UserRequest;
import com.mirea.bakiev.entity.UserEntity;

public interface UserService {

    UserEntity getUser(int id);
    UserEntity addUser(UserRequest userRequest);
}
