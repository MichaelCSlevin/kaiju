package com.example.michaelslevin.kaiju;

/**
 * Created by michaelslevin on 25/10/2017.
 */

public class Gamera extends Kaiju {
    public Gamera(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Turtle trumpet!";
    }

    public String move(){
        return "Gamera plods through the ruins of Akihabara!";
    }

    public void attack(Vehicle vehicle){
        vehicle.healthValue -= this.attackValue;
        System.out.println("Gamera unleashes Shell Cutter!");
    }
}