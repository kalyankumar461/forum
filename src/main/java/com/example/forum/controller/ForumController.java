package com.example.forum.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {

    @GetMapping("/test")
    public ResponseEntity<String> sample() {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
