package com.example.homework2;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ArticleController {

    private Map<Integer, String> articles = new HashMap<>();

    @GetMapping
    public Map<Integer, String> getAllArticles() {
        return articles;
    }

    @GetMapping("/{id}")
    public String getArticleById(@PathVariable int id) {
        return articles.get(id);
    }

    @PostConstruct
    public void init() {
        articles.put(1, "Життя - це подорож, яку варто насолоджуватися кожним кроком.");
        articles.put(2, "У житті немає гарантій, тому слід вірити у себе і йти вперед незалежно від усього.");
        articles.put(3, "Кожен день - це нова можливість для досягнення успіху і зростання.");
        articles.put(4, "Насправді важливе у житті - це люди, яких ми зустрічаємо на своєму шляху, тому слід поважати і цінувати їх.");
        articles.put(5, "У житті не обов'язково бути найкращим, достатньо бути найкращим версією самого себе.");
        articles.put(6, "Навіть у найскладніші моменти життя слід запам'ятовувати, що кожна проблема має своє рішення.");
        articles.put(7, "Життя - це не про те, щоб чекати на чудо, а про те, щоб створювати його самому.");
        articles.put(8, "Найбільші перемоги в житті належать тим, хто не боїться ризикувати і йти за своїми мріями.");
        articles.put(9, "Життя - це подарунок, тому слід вміти насолоджуватися кожною митью і цінувати кожен день.");
    }

}
