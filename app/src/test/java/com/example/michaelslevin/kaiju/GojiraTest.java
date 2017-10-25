package com.example.michaelslevin.kaiju;

import static android.os.Build.VERSION_CODES.M;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by michaelslevin on 25/10/2017.
 */

public class GojiraTest {
    Gojira gojira;
    Avenger avenger;

    @Before
    public void before() {
        gojira = new Gojira("Gojira", 5000, 500);
        avenger = new Avenger("Artillery", 500);
    }



    @Test
    public void hasRoar(){
        assertEquals("Leather glove on a double bass!", gojira.roar());
        }

    @Test
    public void hasMove(){
        assertEquals("Old Gojira hops around Tokyo city like a big playground!", gojira.move());
    }

    @Test
    public void canAttack(){
        gojira.attack(avenger);
        assertEquals(0, avenger.getHealthValue());
    }

}