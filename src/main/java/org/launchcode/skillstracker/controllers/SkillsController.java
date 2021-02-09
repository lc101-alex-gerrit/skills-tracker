package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("form")
    @ResponseBody
    public String getForm(){
        return "<html><body> name:<input name ='name' type = 'text'>";
    }

}
