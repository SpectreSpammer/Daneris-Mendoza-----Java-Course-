package com.onepieceofjava.day6_arrays.multiDimensional;

public class MainMultiDimensional {
    public static void main(String[] args) {

        // id, name,years of service, salary, regular employee
        Object[][] employeeData = {
                {101,"daneris",3,50000.75,false},
                {102,"nan",7,60000.75,true},
                {103,"nami",9,70000.75,false},
                {104,"robin",5,80000.75,true},
        };

        displayEmployeeData(employeeData);

        System.out.println("Applying 10% raise to the employees which has 5 yrs of experience");

        for(int i = 0; i< employeeData.length;i++){
            if((int)employeeData[i][2] >= 5){
                double originalSalary = (double)employeeData[i][3];
                employeeData[i][3] = (double)employeeData[i][3] * 1.10;
                System.out.printf("%s received a 10%% raise. Original Salary: Php %.2f, New Salary Php %.2f %n",
                        employeeData[i][1],               originalSalary,                           employeeData[i][3]);

            }
        }
    }

    private static void displayEmployeeData(Object[][] employeeData) {
        for(Object[] empInfo : employeeData){
            System.out.println("Employee id: " + empInfo[0]);
            System.out.println("Employee name: " + empInfo[1]);
            System.out.println("Employee salary: " + empInfo[2]);
            System.out.println("Is the employee regular?: " + empInfo[3]);
            System.out.println();
        }
    }
}
