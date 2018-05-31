package com.isa.swagger.basic.lesson4.controllers;

import com.isa.swagger.basic.lesson4.model.Person;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class PersonController {

    @GetMapping(path = "/person")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-Custom-Header", value = "Some custom header",
                    dataTypeClass = String.class, paramType = "header")
    })
    public Person getPerson(@RequestHeader("X-Person-Id") int personId) {
        return Person.builder()
                .id(personId)
                .name("john")
                .age(20)
                .build();
    }

    @PostMapping(path = "/person")
    public Person createPerson(@ModelAttribute Person person) {
        return person;
    }
}
