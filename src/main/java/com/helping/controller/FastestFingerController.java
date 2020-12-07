package com.helping.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fastestFinger")
public class FastestFingerController {


    @GetMapping("/register")
    public void registerCandidate() {

    }

}
