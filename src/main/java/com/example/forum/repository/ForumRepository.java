package com.example.forum.repository;

import com.example.forum.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumRepository extends MongoRepository<Person, String> {
}
