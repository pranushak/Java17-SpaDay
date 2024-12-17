package org.launchcode.controllers;

import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm(){
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if(verify.equals(user.getPassword())) {
            UserData.add(user);
            model.addAttribute("users",UserData.getAll());
            return "user/index";
        }else{
            model.addAttribute("error","Both passwords should match!");
            model.addAttribute("userName",user.getUserName());
            model.addAttribute("email",user.getEmail());
            return "user/add";
        }
    }
}
