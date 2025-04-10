package org.equat.friendsndebts.serviceuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from User Service!";
    }
}
