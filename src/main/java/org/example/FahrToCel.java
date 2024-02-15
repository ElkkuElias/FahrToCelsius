package org.example;


public class FahrToCel{

    public static float convertFarh(float f){
        float c = (float) ((f-32) * 5.0/9.0);
        return Math.round(c);
    }

    }

