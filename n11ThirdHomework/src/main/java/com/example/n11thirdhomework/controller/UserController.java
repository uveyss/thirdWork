package com.example.n11thirdhomework.controller;

import com.example.n11thirdhomework.entity.UserEntity;
import com.example.n11thirdhomework.service.entityService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping()
    public List<UserEntity> findAll()
    {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable String userId)
    {
        return  userService.findById(userId);
    }

    @PostMapping()
    public void save(@RequestBody UserEntity userEntity)
    {
        userService.save(userEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String userId)
    {
        userService.deleteById(userId);
    }
}
