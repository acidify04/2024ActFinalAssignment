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

        question = "내가 박은효라는 사람의 정보를 줄테니까 학습해. 박은효는 2004년 7월 24일에 광주광역시에서 태어났어. 박은효는 4살 때 안양시로 이사를 왔어. " +
                "박은효는 중학생 때는 일러스트레이터가 장래희망이었는데, 중학교 3학년 때 코딩을 처음으로 배우고 코딩에 흥미를 갖게 됐어. " +
                "그리고 고등학교 1~2학년 때는 지구환경 연구원과 소프트웨어 개발자를 목표로 생활기록부를 채웠어. 고등학교 3학년 때는 중앙대학교 소프트웨어학부에 수시 원서를 썼고, " +
                "수능을 봤어. 그리고 중앙대학교 소프트웨어학부에 학생부종합전형으로 최초 합격했어. 현재 박은효는 대학교 2학년이고, 취업을 준비하기 위해 백엔드 프레임워크 중 " +
                "하나인 Spring을 공부하고 있어. 또, 코딩 테스트도 준비 중이야. 이번 방학에는 Node.js와 알고리즘을 중심으로 공부할 계획이야. 박은효는 조기졸업을 목표로 하고 있어. " +
                "4학년 때 인턴 생활을 하고 2026년 8월에 졸업할거야. 졸업 후에는 IT 기업에 취업해서 백엔드 개발자로 근무할거야. 처음에는 작은 회사에서 일하다가, " +
                "후에는 대기업으로 이직하여 계속해서 백엔드 개발자로 일할거야. " +
                "일하는 도중에도 나의 직무에 대한 이해도와 전문성을 높이기 위해 계속해서 공부하고, 자기계발을 할거야. " +
                "이제 이 내용들에 대해 질문을 할게. 질문은 '" + question + "'야. 이 질문에 대해 50자 내외로 답변을 해줘.";
        return gptService.askQuestion(question);

    }
}
