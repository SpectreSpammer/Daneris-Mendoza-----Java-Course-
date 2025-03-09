package com.onepieceofjava.day3_primitive_types_and_data_types.reference;



public class MainReference {
    public static void main(String[] args) {

        EmployeeReference manager = new Manager();
        EmployeeReference developer = new Developer();
        EmployeeReference designer = new Designer();


        EmployeeReference [] employees = { manager,developer, designer };

        for( EmployeeReference emp : employees){
            emp.work();
            emp.lunch();
            emp.attendMeeting();
            System.out.println();
        }
    }
}
