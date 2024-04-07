package com.example.keywordresearchtool.domain.keyword;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "keyword")
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "keyword_id")
    private Long keywordId;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "search_volum")
    private Integer search_Volum;

    @Column(name = "competition")
    private Long competition;

    @Column(name = "cpc")
    private Long cpc;

    @Column(name = "created_at")
    private String createdAt;
}
