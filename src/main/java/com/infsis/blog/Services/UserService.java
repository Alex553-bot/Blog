package com.infsis.blog.Services;

import com.infsis.blog.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service 
public interface UserService {
    
    List<UserDTO> getUsers();
    
    Optional<UserDTO> getUserByID(Integer UserId);
    
    UserDTO saveUser(UserDTO userDTO);

    UserDTO updateUser(Integer id, UserDTO userDTO);
    
    void delete(Integer id);
}