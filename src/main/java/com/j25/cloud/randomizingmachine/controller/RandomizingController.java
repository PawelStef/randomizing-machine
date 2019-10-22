package com.j25.cloud.randomizingmachine.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomizingController {
    @Value("${random.words}")
    private String[] words;

    @Value("${random.numbers}")
    private String[] numbers;


    @GetMapping("/word")
    public String randomWord() {
        Random random = new Random();

        int a = random.nextInt(6);
        return words[a];

    }

    @GetMapping("/number")
    public String randomNumber() {
        Random random = new Random();

        int a = random.nextInt(6);
        return numbers[a];
    }
}
