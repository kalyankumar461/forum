package com.example.forum;

import org.springframework.boot.SpringApplication;

public class TestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(ForumApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
