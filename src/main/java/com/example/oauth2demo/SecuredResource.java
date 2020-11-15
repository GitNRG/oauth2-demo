package com.example.oauth2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured-resource")
public class SecuredResource {
    @GetMapping
    public String getSecuredResource(){
        return "Secured info";
    }
}
