package com.example._act.service;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GptService {
    final private ChatgptService chatgptService;

    public String askQuestion(String question) {
        return chatgptService.sendMessage(question);
    }

}
