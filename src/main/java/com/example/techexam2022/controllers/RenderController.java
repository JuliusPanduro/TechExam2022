package com.example.techexam2022.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Julius Panduro
 */
@Controller
public class RenderController {

    @GetMapping("/")
    public String renderIndex(){
        return "index.html";
    }

}
