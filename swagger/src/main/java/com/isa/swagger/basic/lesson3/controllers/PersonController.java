package com.isa.swagger.basic.lesson3.controllers;

import com.isa.swagger.basic.lesson3.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(path = "/api")
public class PersonController {

    @GetMapping(path = "/person")
    public Person getPerson() {
        return Person.builder()
                .name("john")
                .age(20)
                .build();
    }

    @PostMapping(path = "/person")
    public Person createPerson(@ModelAttribute Person person) {
        return person;
    }

    @ApiIgnore
    @PutMapping(path = "/person")
    public Person updatePerson(@ModelAttribute Person person) {
        return person;
    }
}
