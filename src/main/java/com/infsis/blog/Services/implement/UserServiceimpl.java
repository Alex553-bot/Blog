package com.infsis.blog.Services.implement;

import com.infsis.blog.DTOs.UserDTO;
import com.infsis.blog.Models.User;
import com.infsis.blog.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceimpl implements UserService {
    @Override
    public Optional<UserDTO> getUserByID(Integer UserId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return userDTO;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {

        return null;
    }
    @Override
    public void delete(UserDTO userDTO) {
    }
    // estos son los mappers:
    private UserDTO UsertoDTO(User user) {
        UserDTO userDTO = new UserDTO(
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }
    private User DTOtoUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        return user;
    }
}
