package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("form")
    @ResponseBody
    public String getForm(){
        return "<html><body> <form action='/form' method=post> name:<br><input name ='name' type = 'text'>" +
                "<br>" +
                "My Favorite Language: <br>" +
                "<select name=languageOne><option value=Java >Java</option><option value=JavaScript>JavaScript</option><option value=Ruby>Ruby</option></select>" +
                "<br>My Second Favorite Language: <br>" +
                "<select name=languageTwo><option value=Java >Java</option><option value=JavaScript>JavaScript</option><option value=Ruby>Ruby</option></select>" +
                "<br>My Third Favorite Language: <br>" +
                "<select name=languageThree><option value=Java >Java</option><option value=JavaScript>JavaScript</option><option value=Ruby>Ruby</option></select>" +
                "<br><input type=submit> </form> </body> </html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String postForm(@RequestParam String name,
                           @RequestParam String languageOne,
                           @RequestParam String languageTwo,
                           @RequestParam String languageThree) {
        return "<html><body><h1>" + name + "</h1>" +
                "<ol><li>" + languageOne + "</li>" +
                "<li>" + languageTwo + "</li>" +
                "<li>" + languageThree + "</li></ol></body></html>";

    }

}
