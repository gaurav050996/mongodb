package com.example.mongodb.controller;



import com.example.mongodb.model.Users;
import com.example.mongodb.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class USerController {

    @Autowired
    UserRepo userRepo;


    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody Users users){
        Users savedUser = this.userRepo.save(users);
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUser(){
        List<Users> userList = userRepo.findAll();
        return new ResponseEntity<>(userList,HttpStatus.OK);
    }

}
