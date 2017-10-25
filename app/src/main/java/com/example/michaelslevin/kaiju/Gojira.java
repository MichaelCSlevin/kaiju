package com.example.michaelslevin.kaiju;

/**
 * Created by michaelslevin on 25/10/2017.
 */

public class Gojira extends Kaiju {
    public Gojira(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Leather glove on a double bass!";
    }

    public String move(){
        return "Old Gojira hops around Tokyo city like a big playground!";
    }

    public void attack(Vehicle vehicle){
        vehicle.healthValue -= this.attackValue;
        System.out.println("Gojira unleashes Dragon Breath!!");
    }


}
