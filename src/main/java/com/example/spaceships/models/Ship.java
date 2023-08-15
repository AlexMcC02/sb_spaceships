package com.example.spaceships.models;

public class Ship {

    private int id;
    private int captainId;
    String name;
    Shield shield;
    Weapon weapon;
    int speed;

    public Ship(int id, int captainId, String name, Shield shield, Weapon weapon, int speed) {
        this.id = id;
        this.captainId = captainId;
        this.name = name;
        this.shield = shield;
        this.weapon = weapon;
        this.speed = speed;
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

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCaptainId() {
        return captainId;
    }

    public void setCaptainId(int captainId) {
        this.captainId = captainId;
    }
}
