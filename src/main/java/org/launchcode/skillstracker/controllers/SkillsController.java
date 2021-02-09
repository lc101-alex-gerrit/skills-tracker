package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("form")
    @ResponseBody
    public String getForm(){
        return "<html><body> <form action='/form' method=post> name:<input name ='name' type = 'text'>" +
                "<br>" +
                "My Favorite Language: <br>" +
                "<select name=languageOne><option value=Java >Java</option><option value=JavaScript>JavaScript</option><option value=Ruby>Ruby</option></select>" +
                "My Second Favorite Language: <br>" +
                "<select name=languageTwo><option value=Java >Java</option><option value=JavaScript>JavaScript</option><option value=Ruby>Ruby</option></select>" +
                "My Third Favorite Language: <br>" +
                "<select name=languageThree><option value=Java >Java</option><option value=JavaScript>JavaScript</option><option value=Ruby>Ruby</option></select>" +
                "<input type=submit> </form> </body> </html>"

                ;
    }

}
