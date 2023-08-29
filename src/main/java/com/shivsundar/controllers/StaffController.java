package com.shivsundar.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @GetMapping
    public ResponseEntity<String> getMsg(){
        return ResponseEntity.ok("Hello");
    }
}
