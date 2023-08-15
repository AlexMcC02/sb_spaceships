package com.example.spaceships.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Captain {
    private int id;
    private String name;
    private int age;
    private Rank rank;
}
