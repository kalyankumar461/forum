package com.example.forum.service;

import com.example.forum.model.Person;
import com.example.forum.repository.ForumRepository;
import org.springframework.stereotype.Service;

@Service
public class ForumService {

    private final ForumRepository forumRepository;

    public ForumService(ForumRepository forumRepository) {
        this.forumRepository = forumRepository;
    }

    public void createForm(Person person) {
        System.out.println("Person-->"+person);
        forumRepository.save(person);
    }

}
