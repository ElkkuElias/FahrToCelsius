package org.example;

import org.example.FahrToCel;

public class App {

    public static void main(String []args){
        FahrToCel converter = new FahrToCel();
        System.out.println("212 Fahrenheit is equal to " + converter.convertFarh(212) + " Celsius");
        System.out.println("273 Kelvin is equal to " + Math.round(converter.kelvintoCel(273)) + " Celsius");
        System.out.println("300.1 Kelvin is equal to " + Math.round(FahrToCel.kelvintoFarh(300.1)) + " Fahrenheit");
    }
}
