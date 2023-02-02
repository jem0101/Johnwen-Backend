package com.johnwen.johnwenbackend.dog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class DogController {
    @GetMapping
    public String bark() {
        return "Woof!";
    }
}
