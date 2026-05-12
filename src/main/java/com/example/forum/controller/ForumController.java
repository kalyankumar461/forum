package com.example.forum.controller;


import com.example.forum.model.Person;
import com.example.forum.service.ForumService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {

    private final ForumService forumService;

    public ForumController(ForumService forumService) {
        this.forumService = forumService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> sample() {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Person person) {

        forumService.createForm(person);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }
}
