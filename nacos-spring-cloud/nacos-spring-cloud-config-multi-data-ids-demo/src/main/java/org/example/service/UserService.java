package org.example.service;

import org.example.model.User;
import org.springframework.stereotype.Service;

/**
 * @author hexu.hxy
 * @date 2019/1/7
 */

@Service
public interface UserService {

    User findById(Long id);

}