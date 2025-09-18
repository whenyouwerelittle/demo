package com.example.demo.article.entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article{
// public class Article extends BaseEntity {
// public class Article extends BaseEntityName{
    private String subject;
    private String content;
}