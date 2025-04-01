package com.onepieceofjava.day10_collections_framework.hashMap;

public class MainHashMap {
    public static void main(String[] args) {

        EmployeeHashmapService employee = new EmployeeHashmapService();

        employee.addEmployee(new EmployeeHashMap(5,"daneris", "IT"));
        employee.addEmployee(new EmployeeHashMap(2,"nan", "Devops"));
        employee.addEmployee(new EmployeeHashMap(3,"nami", "Hr"));
        employee.addEmployee(new EmployeeHashMap(1,"robin", "Pr"));
        employee.addEmployee(new EmployeeHashMap(4,"sanji", "Kitchen"));

        System.out.println("Print Employees");
        employee.displayEmployee();
        System.out.println();

        System.out.println("Get employee #3");
        int searchById = 3;
        EmployeeHashMap emp = employee.getEmployeeById(searchById);
        System.out.println("Employee with an Id " + searchById + " : " + emp);
        System.out.println();

        System.out.println("Update employee #5");
        employee.updateEmployeeById(5,"daaaneris","Information Technology");
        System.out.println("After updating the employee");
        employee.displayEmployee();
        System.out.println();

        System.out.println("Remove employee id # 2");
        int removeId = 2;
        employee.removeEmployeeById(removeId);
        System.out.println("After removing id #2");
        employee.displayEmployee();
        System.out.println();

        System.out.println("Check if the employee 4 is exist?");
        int checkId = 2;
        System.out.println("DOes employee: " + checkId + " exist? " + employee.hasEmployee(2));
        System.out.println();

        System.out.println("total number of employees: " + employee.getTotalEmployee());
    }
}
