package com.example.michaelslevin.kaiju;

/**
 * Created by michaelslevin on 25/10/2017.
 */

public abstract class Kaiju {
    String name;
    Integer healthValue;
    Integer attackValue;

    public Kaiju(String name, Integer healthValue, Integer attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public abstract String roar();

    public abstract String move();

    public abstract void attack(Vehicle vehicle);

}

