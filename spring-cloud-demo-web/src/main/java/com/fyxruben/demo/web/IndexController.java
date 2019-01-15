package com.fyxruben.demo.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public Object index() {
        return new ModelMap().addAttribute("name", "fyxruben");
    }
}
