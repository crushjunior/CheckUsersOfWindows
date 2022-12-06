package ru.charushnikov.checkusersofwindows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static ru.charushnikov.checkusersofwindows.service.CheckUserService.checkUser;

@Controller
public class CheckUserController {
    @GetMapping("/result")
    public String getResult(@RequestParam("name") String name, Model model){
        String resultMessage = checkUser(name);
        model.addAttribute("resultMessage", resultMessage);
        return "result";
    }
}