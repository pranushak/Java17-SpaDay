package org.launchcode.controllers;

import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
            System.out.println(UserData.getAll().size());
            return "user/index";
        }else{
            model.addAttribute("error","Both passwords should match!");
            model.addAttribute("userName",user.getUserName());
            model.addAttribute("email",user.getEmail());
            return "user/add";
        }
    }
    @GetMapping("/{id}")
    public String displayUserDetails(@PathVariable int id, Model model){
        User user = UserData.getById(id);
        model.addAttribute("user",user);
        return "user/details";
    }
}
