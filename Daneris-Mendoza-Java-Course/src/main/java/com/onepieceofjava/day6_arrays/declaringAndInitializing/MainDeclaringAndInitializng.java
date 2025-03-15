package com.onepieceofjava.day6_arrays.declaringAndInitializing;

public class MainDeclaringAndInitializng {
    public static void main(String[] args) {

        //data type variable name = {""}

        String [] names = {"daneris","nan","nami","robin"};

        //printing all employees
        for(String name : names){
            System.out.println(" - " + name);
        }

        double [] salary = { 50000.75,60000.75,70000.75,80000.75};
        for(double rates : salary){
            System.out.println(" - " + rates);
        }
    }
}
