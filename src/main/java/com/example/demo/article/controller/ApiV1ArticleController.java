package com.example.demo.article.controller;

import com.example.demo.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController //responsebody 없이 json 주고받음
// @RestControllerAdvice
@RequestMapping("api/v1/articles")
@RequiredArgsConstructor // 필드 자동생성
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")
    public String list(){
        return "lists";
    }

    @GetMapping("/{id}")
    public String getArticle(){
        return "single";
    }

    @PostMapping("")
    public String create(){
        return "create";
    }

    @PatchMapping("/{id}")
    public String modify(){
        return "modify";
    }

    @DeleteMapping("/{id}")
    public String delete(){
        return "delete";
    }
}
