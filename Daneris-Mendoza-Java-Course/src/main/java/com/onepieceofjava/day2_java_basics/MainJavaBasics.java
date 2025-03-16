package com.onepieceofjava.day2_java_basics;

public class MainJavaBasics {
    public static void main(String[] args) {

        Car landcruiser = new Toyota();

        landcruiser.doors();


        Car miata = new Mazda();
        miata.doors();

        Mazda.engine();

    }
}
