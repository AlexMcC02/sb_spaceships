package com.example.spaceships.models;

public class Shield {
    private int id;
    private int strength;
    private ShieldType shieldType;

    public Shield(int id, int strength, ShieldType shieldType) {
        this.id = id;
        this.strength = strength;
        this.shieldType = shieldType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public ShieldType getShieldType() {
        return shieldType;
    }

    public void setShieldType(ShieldType shieldType) {
        this.shieldType = shieldType;
    }
}
