package com.winners.microuser.controller;

import com.winners.microuser.entity.User;
import com.winners.microuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users")
public class UserRestAPI {
    private String title = "Hello, I'm the user Microservice";
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
    @PutMapping(value = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public  ResponseEntity<User> updateUser(@PathVariable(value = "id")int id,@RequestBody User user)
    {
        return new ResponseEntity<>(userService.updateUser(id, user), HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(userService.deleteUser(id), HttpStatus.OK);
    }
}
