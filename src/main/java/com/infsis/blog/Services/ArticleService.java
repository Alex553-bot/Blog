package com.infsis.blog.Services;

import org.springframework.stereotype.Service;

import com.infsis.blog.DTOs.ArticleDTO;

import java.util.Optional;

@Service
public interface ArticleService {

    Optional<ArticleDTO> getArticleByID(Integer id);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer id, ArticleDTO articleDTO);
    void deleteArticle(Integer id);    
}