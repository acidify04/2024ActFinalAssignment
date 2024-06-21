package com.example._act.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
@Slf4j

public class PageController {

    @GetMapping(value = "/page_1")
    String getMagicUniv_enroll_01(){
        return "page_1";
    }

}
