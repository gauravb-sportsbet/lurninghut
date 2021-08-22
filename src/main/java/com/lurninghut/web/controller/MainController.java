package com.lurninghut.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(final Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("fields", List.of("one", "two"));
         return "index";
    }
}
