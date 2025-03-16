package com.onepieceofjava.day7_methods;

public class MainMethodOverloading {
    public static void main(String[] args) {


        displayEmployeeInfo("daneris", 30);

        //method 1 - int + double
        double weeklyIncome = calculateSalary(40, 1500.75);
        System.out.println(" - Daily Income: " + weeklyIncome);

        // method 2 - double + int
        double bonus = calculateSalary(40000.75, 10);
        System.out.println(" - Bonus: " + bonus);

        //method - double + string
        System.out.println("Employee with a bonus of: " + calculateSalary(40000.75, "excellent"));


    }

    private static String calculateSalary(double salary, String performanceRating) {

        double percentage;

        switch (performanceRating.toLowerCase()){
            case "excellent":
                percentage = 0.1;
                break;

            case "good":
                percentage = 0.5;
                break;

            default:
                percentage = 0.03;
                performanceRating = "average";
        }

        double bonusAmount = salary * percentage;
        return String.format("Daneris got received a bonus, Php %.2f ( Performance: %s )" ,
                                                    bonusAmount, performanceRating);
    }

    private static double calculateSalary(int hoursWorked, double hourlyRate) {

        return hourlyRate * hoursWorked;
    }

    private static double calculateSalary(double salary, int yearsOfService) {

        return salary * yearsOfService;
    }

    private static void displayEmployeeInfo(String name, int age) {
        System.out.println(" - Name:" + name);
        System.out.println(" - Age: " + age);
    }
}
