package com.example.oauth2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/logout")
public class LogoutController {
    @GetMapping
    public void getSecuredResource(HttpServletRequest request) throws ServletException {
        request.logout();
    }
}
