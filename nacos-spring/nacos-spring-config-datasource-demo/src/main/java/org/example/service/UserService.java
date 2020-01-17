package org.example.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Integer id);
}