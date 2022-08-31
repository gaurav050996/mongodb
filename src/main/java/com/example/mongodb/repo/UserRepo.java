package com.example.mongodb.repo;

import com.example.mongodb.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<Users,Long> {

}
