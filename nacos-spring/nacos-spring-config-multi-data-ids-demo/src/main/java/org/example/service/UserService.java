package org.example.service;

import org.example.model.User;

/**
 * @author hexu.hxy
 * @date 2019/1/7
 */
public interface UserService {

    User findById(Long id);

}