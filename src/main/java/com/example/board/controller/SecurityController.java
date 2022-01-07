package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {

    @GetMapping("/system/login")
    public void login(){}

    @GetMapping("/system/accessDenied")
    public void accessDenied(){}

    @GetMapping("/system/logout")
    public void logout(){}

    @GetMapping("/admin/adminPage")
    public void adminPage(){}
}
