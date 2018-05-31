package com.isa.swagger.basic.lesson6.controller;

import com.isa.swagger.basic.lesson6.annotation.ApiHeaderSupport;
import com.isa.swagger.basic.lesson6.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PersonController {

    @ApiHeaderSupport("X-Custom-Id")
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
