package com.isa.swagger.basic.lesson5.controllers;

import com.isa.swagger.basic.lesson5.model.Person;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
@Api(tags = "Person Related Api")
public class PersonController {

    @GetMapping(path = "/person")
    public Person getPerson() {
        return Person.builder()
                .id(1)
                .name("john")
                .age(20)
                .build();
    }

    @PostMapping(path = "/person")
    public Person createPerson(@ModelAttribute Person person) {
        return person;
    }
}
