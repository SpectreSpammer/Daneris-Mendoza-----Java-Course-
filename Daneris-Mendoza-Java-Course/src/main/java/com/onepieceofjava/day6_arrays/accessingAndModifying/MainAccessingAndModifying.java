package com.onepieceofjava.day6_arrays.accessingAndModifying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAccessingAndModifying {
    public static void main(String[] args) {


        int [] arr = new int[]{1,2,3,4,5};
        int [] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;
//        arr2[5] = 6;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,12);

        List<Integer> number2 = Arrays.asList(1,2,3,4,5);

        String [] names = {"daneris","nan","nami","robin"};
        int [] yearsOfExperience = {5,7,2,11};
        double [] salary = { 50000.75,60000.75,70000.75,80000.75};
        boolean [] isLate = { true, false, false, true};

        //name of employees
        for(String empNames : names){
            System.out.println("Employee names: " + empNames);
        }

        System.out.println("Applying 10% raise to the employees which has 10% yrs of experience");
        for(int i=0; i< yearsOfExperience.length;i++){
            if(yearsOfExperience[i] > 5){
                double originalSalary = salary[i];
                salary[i] *= 1.10;
                System.out.printf("%s received a 10%% raise. Original Salary: Php %.2f, New Salary Php %.2f %n",
                                    names[i],               originalSalary,                            salary[i]);
            }
        }
        System.out.println();

        System.out.println("Applying 10% deduction to the employees which is late");
        for(int i=0; i< names.length;i++){
            if(isLate[i]){
                double originalSalary = salary[i];
                salary[i] -= 90.0;
                System.out.printf("%s received a 10%% deduction. Original Salary: Php %.2f, New Salary Php %.2f %n",
                        names[i],               originalSalary,                            salary[i]);
            }
        }



    }
}
