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



}