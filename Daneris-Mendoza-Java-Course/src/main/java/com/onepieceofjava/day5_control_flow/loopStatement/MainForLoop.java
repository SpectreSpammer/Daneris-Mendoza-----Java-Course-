package com.onepieceofjava.day5_control_flow.loopStatement;

public class MainForLoop {
    public static void main(String[] args) {
        //break , continue

        double salary = 70000.75;

        System.out.println("Salary increment per year");
        for (int year = 1; year <= 5; year++) {
            if (year == 3) {
                System.out.println("Skipping year due to company policy");
//                continue;
                break;
            }
            salary *= 1.05;
            System.out.printf("Year %d: Php .%2f %n",
                    year, salary);

        }
    }
}
