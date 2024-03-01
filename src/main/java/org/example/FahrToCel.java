package org.example;


public class FahrToCel{

    public static float convertFarh(float f){
        float c = (float) ((f-32) * 5.0/9.0);
        return Math.round(c);
    }
    public static float kelvintoCel(float kel){
        return  (kel-273.15F);
    }

    public static float kelvintoFarh(double kel){
        return (float) ((kel-273.15) * (9/5) + 32);

    }


}

