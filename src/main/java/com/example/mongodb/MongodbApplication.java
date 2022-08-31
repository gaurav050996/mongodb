package com.example.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class MongodbApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

    @PostConstruct
    void print(){
        logger.info("Application started");
    }

    public static void main(String[] args) {
        SpringApplication.run(MongodbApplication.class, args);
    }

}
