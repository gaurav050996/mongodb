package com.example.mongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "users")
public class Users {

    @Field @Id
    private Integer userId;
    @Field
    private String name;
    @Field
    private String email;

    public Integer getId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        userId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users(Integer userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }
}
