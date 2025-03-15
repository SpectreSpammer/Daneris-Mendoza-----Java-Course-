package com.onepieceofjava.day4_operators.logical;

public class MainLogical {
    public static void main(String[] args) {

        int yearsOfService = 7;
        double salary =  100000;



        // && AND
        if(yearsOfService == 10 && salary < 50000){
            System.out.println(" Daneris has been an employee for a decade but underpaid.");
        }else {
            System.out.println(" Daneris has been an employee for a less than decade but well compensate.");
        }

        //OR ||
        if(yearsOfService == 10 || salary > 50000){
            System.out.println(" Daneris has been an employee for a decade but underpaid.");
        }else {
            System.out.println(" Daneris has been an employee for a less than decade but well compensate.");
        }

    }
}
