package com.example.appqlsv.controller;

import com.example.appqlsv.model.User;
import com.example.appqlsv.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class UserController {
  @Autowired
  private UserRepo userRepo;

  @GetMapping("/user")
  public List<User> getUser(){
    return userRepo.findAll();
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<User> getUserById(@PathVariable(name = "id")long id){
    return ResponseEntity.ok(userRepo.findById(id).get());
  }

  @PostMapping("/user")
  public ResponseEntity<User> saveUser(@RequestBody User user){
    userRepo.save(user);
    return ResponseEntity.ok(user);
  }

  @PutMapping("/user/{id}")
  public ResponseEntity<User> updateUser(@PathVariable(name = "id") long id,@RequestBody User user){
    User updateUser = userRepo.findById(id).get();


    updateUser.setFirstName(user.getFirstName());
    updateUser.setAge(user.getAge());
    updateUser.setAddress(user.getAddress());
    userRepo.save(updateUser);
    return ResponseEntity.ok(updateUser);
  }

  @DeleteMapping("/user/{id}")
  public ResponseEntity<User>  deleteUser(@PathVariable(name = "id") long id){
    userRepo.deleteById(id);
    return ResponseEntity.ok().build();
  }

}
