package com.infsis.blog.Services;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.infsis.blog.DTOs.RoleDTO;

@Service
public interface RoleService {    
    Optional<RoleDTO> getRoleByID(Integer id);
    RoleDTO saveRole(RoleDTO RoleDTO);
    RoleDTO updateRole(RoleDTO roleDTO);
    void deleteRole(RoleDTO roleDTO);
}