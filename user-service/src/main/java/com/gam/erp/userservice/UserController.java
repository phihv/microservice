package com.gam.erp.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/get")
    public String hello() {
        return "These are the users!";
    }

    @GetMapping("/delete")
    public String delete() {
        return "Delete done!";
    }
}