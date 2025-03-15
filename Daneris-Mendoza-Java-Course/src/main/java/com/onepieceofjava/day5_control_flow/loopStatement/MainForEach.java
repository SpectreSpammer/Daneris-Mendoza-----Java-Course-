package com.onepieceofjava.day5_control_flow.loopStatement;

import java.util.List;

public class MainForEach {
    public static void main(String[] args) {

        String [] names = {"daneris","nan","nami","robin"};

        //printing all employees
        for(String name : names){
            System.out.println(" - " + name);
        }

        //List
        List<String> listOfEmployees = List.of("daneris","nan","zorro","sanji");
        for(String employeeList : listOfEmployees){
            System.out.println(" - " + employeeList);
        }
    }
}
