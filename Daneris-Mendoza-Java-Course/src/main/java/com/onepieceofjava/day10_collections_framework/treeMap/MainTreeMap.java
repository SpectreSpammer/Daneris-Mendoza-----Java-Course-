package com.onepieceofjava.day10_collections_framework.treeMap;

import com.onepieceofjava.day10_collections_framework.hashMap.EmployeeHashMap;

public class MainTreeMap {
    public static void main(String[] args) {

        EmployeeServiceTreeMap employeeService = new EmployeeServiceTreeMap();

        employeeService.addEmployee(new EmployeeTreeMap(5,"daneris", "IT"));
        employeeService.addEmployee(new EmployeeTreeMap(2,"nan", "Devops"));
        employeeService.addEmployee(new EmployeeTreeMap(3,"nami", "Hr"));
        employeeService.addEmployee(new EmployeeTreeMap(1,"robin", "Pr"));
        employeeService.addEmployee(new EmployeeTreeMap(4,"sanji", "Kitchen"));

        System.out.println("Print all employees");
        employeeService.displayEmployee();
        System.out.println();

        int checkId = 8;
        System.out.println("Does employee " + checkId + " exist? " + employeeService.hasEmployee(checkId));
        System.out.println();

        System.out.println("Getting the first id: " + employeeService.getFirstEmployee() );
        System.out.println("Getting the last id: " + employeeService.getLastEmployee() );
        System.out.println("Getting the employee by id" + employeeService.getEmployeeById(2) );

        System.out.println();

        System.out.println("Updating employee # 4");
        employeeService.updateEmployeeById(4,"zoro","Security");
        employeeService.displayEmployee();
        System.out.println();

        System.out.println("Deleting employee # 3");
        employeeService.removeEmployeeById(3);
        employeeService.displayEmployee();
        System.out.println();

        System.out.println("Total # of employees: " + employeeService.getTotalEmployee());
    }
}
