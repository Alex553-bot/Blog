package com.infsis.blog.Services.implement;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.infsis.blog.DTOs.ArticleDTO;
import com.infsis.blog.Models.Article;
import com.infsis.blog.Services.ArticleService;

@Service
public class Articleimpl implements ArticleService{

    @Override
    public Optional<ArticleDTO> getArticleByID(Integer id) {
        return Optional.empty();
    }
    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return articleDTO;
    }
    @Override
    public ArticleDTO updateArticle(ArticleDTO articleDTO) {
        return articleDTO;
    }
    @Override
    public void deleteArticle(ArticleDTO articleDTO) {}

    // mappers: 
    private ArticleDTO ArticletoDTO(Article article) {
        ArticleDTO articleDTO = new ArticleDTO(
            article.getTitle(), 
            article.getReference()
        );
        return articleDTO;
    }
    private Article DTOtoArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        article.setReference(articleDTO.getReference());
        article.setTitle(articleDTO.getTitle());
        return article;
    }
}