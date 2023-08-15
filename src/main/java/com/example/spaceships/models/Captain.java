package com.example.spaceships.models;

public class Captain {
    int id;
    String name;
    int age;
    Rank rank;

    public Captain(int id, String name, int age, Rank rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
