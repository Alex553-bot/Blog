package com.infsis.blog.Services;

import com.infsis.blog.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // espcializacion de clase component
public interface UserService {
    Optional<UserDTO> getUserByID(Integer UserId);
    UserDTO saveUser(UserDTO userDTO);

    UserDTO updateUser(Integer id, UserDTO userDTO);
    void delete(Integer id);
}