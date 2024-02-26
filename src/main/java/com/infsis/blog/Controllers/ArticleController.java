package com.infsis.blog.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infsis.blog.DTOs.ArticleDTO;

@RestController 
@RequestMapping("/article") 
public class ArticleController {

    @GetMapping
    public ResponseEntity<ArticleDTO> getArticles() {
        ArticleDTO articleDTO = new ArticleDTO(
            1, 
            "article", 
            "article@article"
        );
        return ResponseEntity.ok().body(articleDTO);
    }
    
    @PostMapping("/save")
    public ResponseEntity<ArticleDTO> saveArticle(
      @RequestBody ArticleDTO articleDTO
    ) {
        return ResponseEntity.ok().body(articleDTO);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDTO> getArticle(
      @PathVariable Integer id
    ) {
        ArticleDTO articleDTO = new ArticleDTO(
            1, 
            "article",
            "article@article"
        );
        return ResponseEntity.ok().body(articleDTO);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateArticle(
      @PathVariable Integer id, 
      @RequestBody ArticleDTO articleDTO
    ) {
        return ResponseEntity.ok().body(articleDTO);
    }
    
    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Integer id) {
    }
}