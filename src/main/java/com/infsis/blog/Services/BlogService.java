package com.infsis.blog.Services;

import com.infsis.blog.DTOs.BlogDTO;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface BlogService {

    Optional<BlogDTO> getBlogByID(Integer id);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(BlogDTO blogDTO);
    void deleteBlog(BlogDTO blogDTO);
}