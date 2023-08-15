package com.example.spaceships.models;

public class Weapon {
    private int id;
    private String name;
    private int power;
    private int range;

    public Weapon(int id, String name, int power, int range) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.range = range;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
