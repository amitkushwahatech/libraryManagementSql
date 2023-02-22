package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String creatUser(User user){
        userRepository.save(user);
        return "user added successfully";
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public  List getAllUser(){
        List<User> allUser = userRepository.findAll();
        return allUser;
    }

}
