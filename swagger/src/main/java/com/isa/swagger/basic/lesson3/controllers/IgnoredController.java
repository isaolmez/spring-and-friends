package com.isa.swagger.basic.lesson3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(path = "/api")
@ApiIgnore
public class IgnoredController {

    @GetMapping(path = "/ignored")
    public void ignored() {
    }
}
