package com.example.forum.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "forumDetails")
public class Person {

    @Id
    private String id;
    private String name;
    private GENDER gender;
    
}
