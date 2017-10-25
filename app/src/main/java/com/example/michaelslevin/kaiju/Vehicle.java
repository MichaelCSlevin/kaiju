package com.example.michaelslevin.kaiju;

import static android.R.attr.name;

/**
 * Created by michaelslevin on 25/10/2017.
 */

public abstract class Vehicle {
    String type;
    Integer healthValue;

    public Vehicle(String type, Integer healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

}