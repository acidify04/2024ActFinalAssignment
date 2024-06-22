package com.example._act.controller;

import com.example._act.dto.QuestionDto;
import com.example._act.service.GptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api/gpt/")
public class GptController {
    @Autowired
    GptService gptService;

    @PostMapping("/ask")
    //@ResponseBody
    public String askController(@RequestBody QuestionDto questionDto) {
        String question = questionDto.getQuestion();
        log.info(question);
        //내가 박은효의 정보를 줄게
        //박은효는 ~~야
//박은효는 ~~야
//박은효는 ~~야
//박은효는 ~~야
//박은효는 ~~야
//그리고 질문은 question이야
        //질문에 대해 50자내외로 답변을 해줘
        return gptService.askQuestion(question);

    }
}
