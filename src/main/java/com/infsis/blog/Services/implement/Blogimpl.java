package com.infsis.blog.Services.implement;

import org.springframework.stereotype.Service;

import com.infsis.blog.DTOs.BlogDTO;
import com.infsis.blog.Models.Blog;
import com.infsis.blog.Services.BlogService;

import java.util.Optional;
@Service
public class Blogimpl implements BlogService {
    @Override
    public Optional<BlogDTO> getBlogByID(Integer id) {
        return Optional.empty();
    }
    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return blogDTO;
    }
    @Override
    public BlogDTO updateBlog(BlogDTO blogDTO) {
        return blogDTO;
    }
    @Override
    public void deleteBlog(BlogDTO blogDTO) {
    }
    // mappers: 
    private Blog DTOtoBlog(BlogDTO blogDTO) {
        Blog blog = new Blog();
        blog.setName(blogDTO.getName());
        return blog;
    }
    private BlogDTO BlogtoDTO(Blog blog) {
        BlogDTO blogDTO = new BlogDTO(
            blog.getName()
        );
        return blogDTO;
    }
}