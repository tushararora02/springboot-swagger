package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name="User APIs", description = "user related APIs")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("id/{userId}")
    @Operation(summary = "get user by user Id")
    public ResponseEntity<?> getUserById(@PathVariable String userId) {

        User user = userService.findByUserId(userId);

        if (user!=null) {
                return new ResponseEntity<>(user, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
