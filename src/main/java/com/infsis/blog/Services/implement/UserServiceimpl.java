package com.infsis.blog.Services.implement;

import com.infsis.blog.DTOs.UserDTO;
import com.infsis.blog.Models.User;
import com.infsis.blog.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceimpl implements UserService {
    @Override
    public List<UserDTO> getUsers() {
        return null;
    } 

    @Override
    public Optional<UserDTO> getUserByID(Integer UserId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return userDTO;
    }

    @Override
    public UserDTO updateUser(Integer id, UserDTO userDTO) {
        return null;
    }
    
    @Override
    public void delete(Integer id) {
    }
    
    private UserDTO UsertoDTO(User user) {
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }
    
    private User DTOtoUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setId(userDTO.getId());
        return user;
    }
}
