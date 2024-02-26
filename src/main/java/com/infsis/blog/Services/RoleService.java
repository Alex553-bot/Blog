package com.infsis.blog.Services;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

import com.infsis.blog.DTOs.RoleDTO;

@Service
public interface RoleService {  
    
    List<RoleDTO> getRoles();  
    
    Optional<RoleDTO> getRoleByID(Integer id);
    
    RoleDTO saveRole(RoleDTO RoleDTO);
    
    RoleDTO updateRole(Integer id, RoleDTO roleDTO);
    
    void deleteRole(Integer id);
}