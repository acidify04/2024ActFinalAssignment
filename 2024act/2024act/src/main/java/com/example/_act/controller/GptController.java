package com.example._act.controller;

import com.example._act.service.GptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GptController {
    @Autowired
    GptService gptService;


}
