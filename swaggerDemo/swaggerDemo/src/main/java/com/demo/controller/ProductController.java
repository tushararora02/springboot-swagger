package com.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@Tag(name="Product APIs", description = "product related APIs")
public class ProductController {

    @GetMapping("/producId/{id}")
    public ResponseEntity<?> getProduct(@PathVariable String id){

        return new ResponseEntity<>("product1", HttpStatus.OK);
    }
}
