package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    void test(@RequestParam Integer age, @RequestParam Category category, @RequestParam Optional<Integer> price) {
        System.out.println(age);
        System.out.println(category);
    }

    @PostMapping("/test")
    @ResponseBody
    void test2(@RequestParam Integer age, @RequestParam List<Category> category) {
        System.out.println(age);
        System.out.println(category);
    }

    enum Category {
        FOOD, OTHERS
    }
}
