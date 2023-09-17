package com.srinath.crud_operation.service;

import java.util.List;

import com.srinath.crud_operation.dto.UserDTO;
import com.srinath.crud_operation.entity.User;

public interface UserService {

    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
    
}
