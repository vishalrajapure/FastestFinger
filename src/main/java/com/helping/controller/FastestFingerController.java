package com.helping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/fastestFinger")
public class FastestFingerController {

    static List<Integer> range = null;


    @GetMapping("/register")
    public void registerCandidate() {
        range = IntStream.range(0, 100).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(range);
        range.subList(0, 99).forEach(System.out::println);
    }

}
