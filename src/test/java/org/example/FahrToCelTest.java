package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrToCelTest {

    @Test
    void FahrToCelsiusTest(){
        FahrToCel Converter = new FahrToCel();
        assertEquals(0,Converter.convertFarh(32));
    }
}