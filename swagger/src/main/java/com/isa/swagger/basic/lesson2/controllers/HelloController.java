package com.isa.swagger.basic.lesson2.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(path = "/hello")
    @ApiOperation("GET mapping for hello")
    public String hello() {
        return "hello";
    }

    @PostMapping(path = "/hello")
    @ApiOperation(value = "POST mapping for hello", notes = "You can send the name")
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad request message"),
            @ApiResponse(code = 404, message = "Not found message")
    })
    public String helloPost(
            @ApiParam(name = "name", required = true)
            @RequestParam(name = "name") String name) {
        return String.format("hello %s", name);
    }
}
