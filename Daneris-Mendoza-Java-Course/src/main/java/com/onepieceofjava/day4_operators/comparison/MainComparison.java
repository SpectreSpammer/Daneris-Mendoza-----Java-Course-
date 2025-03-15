package com.onepieceofjava.day4_operators.comparison;

public class MainComparison {
    public static void main(String[] args) {

        int yearsOfService = 7;
        double salary =  100000;
        int hoursOfWork = 9;


        // equals ==
        if(yearsOfService == 10){
            System.out.println(" Daneris has been an employee for a decade.");
        }else {
            System.out.println(" Daneris has been an employee for a less than decade.");
        }

        //not equal to !=
        if(salary !=50000){
            System.out.println("Daneris salary is not 50k");
        }else{
            System.out.println("Daneris salary is more than 50k");
        }

        //greater than >
        if(hoursOfWork > 9){
            System.out.println("Daneries has having his overtime");
        }else {
            System.out.println("Daneries has having undertime");
        }

        //less than <
        if(salary < 100000){
            System.out.println("Daneris is underpaid");
        }else {
            System.out.println("Daneris is well paid");
        }

        //greater than or equal to >=
        if(hoursOfWork >= 9){
            System.out.println("Daneries has having his overtime");
        }else {
            System.out.println("Daneries has having undertime");
        }

        //less than or equal to <=
        if(salary <= 100000){
            System.out.println("Daneris is underpaid");
        }else {
            System.out.println("Daneris is well paid");
        }

    }
}
