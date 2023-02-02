package com.johnwen.johnwenbackend.dog;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/home")
public class DogController {
    @GetMapping
    public List<Dog> getDog() {
        return List.of(
                new Dog(
                        1L,
                        "Rice",
                        LocalDate.of(2022, Month.APRIL,23),
                        0
                ),
                new Dog(
                        2L,
                        "Happy",
                        LocalDate.of(2022, Month.MARCH, 1),
                        0
                ),
                new Dog(
                        2L,
                        "Dogge",
                        LocalDate.of(2022, Month.DECEMBER, 5),
                        0
                )
        );
    }
}