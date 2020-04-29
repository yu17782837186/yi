package com.ning.controller;

import com.ning.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UsersController {
    @Resource
    private UsersService usersServiceImpl;
    @RequestMapping("show")
    public String show(Model model){
        model.addAttribute("list",usersServiceImpl.show());
        return "forward:/index.jsp";
    }
}
