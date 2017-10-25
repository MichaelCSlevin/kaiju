package com.example.michaelslevin.kaiju;

import static android.os.Build.VERSION_CODES.M;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by michaelslevin on 25/10/2017.
 */

public class GameraTest {
    Gamera gamera;
    Viper viper;

    @Before
    public void before(){
        gamera = new Gamera("Gamera", 4500, 400);
        viper = new Viper("Attack Chopper", 300);
    }

    @Test
    public void hasRoar(){
        assertEquals("Turtle trumpet!", gamera.roar());
    }

    @Test
    public void hasMove(){
        assertEquals("Gamera plods through the ruins of Akihabara!", gamera.move());
    }

    @Test
        public void canAttack(){
        gamera.attack(viper);
        assertEquals(-100, viper.getHealthValue());
    }
}
