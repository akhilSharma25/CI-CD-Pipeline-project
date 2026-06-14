package com.akhil.project_ci_cd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getData(){
        return "Hello Developers ... how ai world change software engineering";
    }
}
