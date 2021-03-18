package com.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/admin")
    public String home() {
        return "admin/admin";
    }

}