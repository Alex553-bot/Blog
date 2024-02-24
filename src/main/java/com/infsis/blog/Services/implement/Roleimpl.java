package com.infsis.blog.Services.implement;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.infsis.blog.DTOs.RoleDTO;
import com.infsis.blog.Services.RoleService;
import com.infsis.blog.Models.Role;

@Service
public class Roleimpl implements RoleService {
    @Override
    public Optional<RoleDTO> getRoleByID(Integer id) {
        return Optional.empty();
    }
    @Override 
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return roleDTO;
    }
    @Override
    public RoleDTO updateRole(RoleDTO roleDTO) {
        return roleDTO;
    }
    @Override
    public void deleteRole(RoleDTO roleDTO) {}
    // mappers: 
    private RoleDTO RoletoDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO(
            role.getName()        
        );
        return roleDTO;
    }
    private Role DTOtoRole(RoleDTO roleDTO) {
        Role role = new Role();
        role.setName(roleDTO.getName());
        return role;
    }
}