package com.gam.erp.iamservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iam")
public class AuthController {
    @PostMapping("/register")
    public String register(@RequestBody String username) {
        return username;
    }
}
