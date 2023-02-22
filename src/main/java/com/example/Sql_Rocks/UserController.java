package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String createUser(@RequestBody() User user){

        //try catch block also use
        return userService.creatUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") Integer id){
       return userService.getUser(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
