package com.example.imperalapii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class imperalapiControllerTest {
    private imperalapiController inmperalapi=new imperalapiController();

    @Test
    public void itctest(){
        double i=5;
        assertEquals(i*2.54,inmperalapi.inchToCentimeter(i));
    }

    @Test
    public void ytmtest(){
        double y=5;
        assertEquals(String.format("%f yard are %f meter",y, y/1.0936133),inmperalapi.yardToMeter(y));
    }



}