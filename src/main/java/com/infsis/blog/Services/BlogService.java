package com.infsis.blog.Services;

import com.infsis.blog.DTOs.BlogDTO;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    
    List<BlogDTO> getBlogs();
    
    Optional<BlogDTO> getBlogByID(Integer id);
    
    BlogDTO saveBlog(BlogDTO blogDTO);
    
    BlogDTO updateBlog(Integer id, BlogDTO blogDTO);
    
    void deleteBlog(Integer id);
}