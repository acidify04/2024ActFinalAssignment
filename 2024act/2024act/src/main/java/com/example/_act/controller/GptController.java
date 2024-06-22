package com.example._act.controller;

import com.example._act.service.GptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gpt/")
public class GptController {
    @Autowired
    GptService gptService;

    @GetMapping("/ask/{question}")
    public String askController(@RequestParam(name = "question") String question) {
        return gptService.askQuestion(question);
    }
}
