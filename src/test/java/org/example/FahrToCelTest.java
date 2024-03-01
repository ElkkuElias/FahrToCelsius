package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrToCelTest {

    @Test
    void FahrToCelsiusTest(){
        FahrToCel Converter = new FahrToCel();
        assertEquals(0,Converter.convertFarh(32));
    }
    @Test
    void KelvinToCelsiusTest(){
        FahrToCel Converter = new FahrToCel();
        assertEquals(0,Converter.kelvintoCel(273.15F));
    }

    @Test
    void converKeltoFarTest(){
        double test = Math.round(FahrToCel.kelvintoFarh(300.1));
        assertEquals(59.0,test);
    }
}