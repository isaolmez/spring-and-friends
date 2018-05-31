package com.isa.swagger.basic.lesson4.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "My Person Model", description = "Model for encapsulating Person")
public class Person {

    private int id;
    private String name;
    private int age;
}
