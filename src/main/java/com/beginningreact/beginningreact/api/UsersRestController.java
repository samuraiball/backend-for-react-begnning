package com.beginningreact.beginningreact.api;

import com.beginningreact.beginningreact.domain.Users;
import com.beginningreact.beginningreact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersRestController {

    @Autowired
    UserService userService;


    @GetMapping
    public List<Users> getUser(){
        return userService.findAll();
    }

    @PostMapping(path = "create")
    @ResponseStatus(HttpStatus.CREATED)
    public Users create(@RequestParam Users users){ return null;}

}
