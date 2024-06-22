package com.example._act.controller;

import com.example._act.service.GptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gpt/")
public class GptController {
    @Autowired
    GptService gptService;

    @GetMapping("/ask/{question}")
    @ResponseBody
    public String askController(@PathVariable(name = "question") String question) {
        return gptService.askQuestion(question);
    }
}
