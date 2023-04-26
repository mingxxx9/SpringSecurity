package com.example.security.service;

import com.example.security.domain.ResponseResult;
import com.example.security.domain.User;

public interface LoginService {
    public ResponseResult login(User user);
    public ResponseResult logout();

}
