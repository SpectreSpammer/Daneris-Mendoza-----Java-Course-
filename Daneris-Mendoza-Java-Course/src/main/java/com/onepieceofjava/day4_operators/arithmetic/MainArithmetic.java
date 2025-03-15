package com.onepieceofjava.day4_operators.arithmetic;

public class MainArithmetic {
    public static void main(String[] args) {


        double salary = 60000.75;
        double bonus = 30000.75;
        double governmentTax = 10000.75;
        double hourlyRate = 1500.75;
        int workingHours = 9;
        int yearsOfService = 7;

        //addition +
        double grossPay = salary + bonus;
        System.out.println("1. Addition");
        System.out.println(" - Gross Pay: " + grossPay);

        //substraction

        double netPay = salary - governmentTax;
        System.out.println("2. Subtraction");
        System.out.println(" - Net Pay: " + netPay);


        //multiplication
        double dailyIncome = hourlyRate * workingHours;
        System.out.println("3. Multiplication");
        System.out.println(" - Daily Income Pay: " + dailyIncome);

        //division
        double annualIncreaseIncome = salary / yearsOfService;
        System.out.println("4. Division");
        System.out.println(" - Annual Increase Income: " + annualIncreaseIncome);

        //modulus
        double remainderFromIncrease = salary / yearsOfService;
        System.out.println("5. Modulus");
        System.out.println(" - remainderFromIncreasee: " + remainderFromIncrease);
    }
}
