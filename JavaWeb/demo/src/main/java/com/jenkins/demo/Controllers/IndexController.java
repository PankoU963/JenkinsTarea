package com.jenkins.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    
    @GetMapping("/holamundo")
    public String getMethodName() {
        return "index.html";
    }
    
}
