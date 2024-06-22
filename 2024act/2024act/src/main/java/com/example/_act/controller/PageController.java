package com.example._act.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
@Slf4j

public class PageController {

    //////////////////////////////////////////////////////////////////
    @GetMapping(value = "/index")
    String getIndex(){
        return "index";
    }
    //////////////////////////////////////////////////////////////////
    @GetMapping(value = "/past/page_1")
    String getPastPage_01(){
        return "past/page_1";
    }

    @GetMapping(value = "/past/page_2")
    String getPastPage_02(){
        return "past/page_2";
    }

    @GetMapping(value = "/past/page_3")
    String getPastPage_03(){
        return "past/page_3";
    }

    @GetMapping(value = "/past/page_4")
    String getPastPage_04(){
        return "past/page_4";
    }

    //////////////////////////////////////////////////////////////////

    @GetMapping(value = "/present/page_1")
    String getPresentPage_01(){
        return "present/page_1";
    }

    @GetMapping(value = "/present/page_2")
    String getPresentPage_02(){
        return "present/page_2";
    }

    @GetMapping(value = "/present/page_3")
    String getPresentPage_03(){
        return "present/page_3";
    }

    //////////////////////////////////////////////////////////////////

    @GetMapping(value = "/future/page_1")
    String getFuturePage_01(){
        return "future/page_1";
    }
    @GetMapping(value = "/future/page_2")
    String getFuturePage_02(){
        return "future/page_2";
    }

    @GetMapping(value = "/future/page_3")
    String getFuturePage_03(){
        return "future/page_3";
    }

    @GetMapping(value = "/future/page_4")
    String getFuturePage_04(){
        return "future/page_4";
    }

    @GetMapping(value = "/chat/eunhyo")
    String getChatEunHyo(){
        return "chat/eunhyo";
    }

}
