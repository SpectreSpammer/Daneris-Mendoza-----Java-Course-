package com.onepieceofjava.day10_collections_framework.arrayList;

import java.util.ArrayList;

public class EmployeeServiceArrayList {

    private ArrayList<EmployeeArrayList> employeeList;


    public EmployeeServiceArrayList() {
       employeeList = new ArrayList<>();
    }

    //get last
    public EmployeeArrayList getLastEmployee(){
        return  employeeList.getLast();
    }

    //get first
    public EmployeeArrayList getFirstEmployee(){
        return  employeeList.getFirst();
    }

    //get by id
    public EmployeeArrayList getEmployeeById(int index){
        return  employeeList.get(index);
    }


    //add by object
    public void addEmployee(EmployeeArrayList addEmployee){
          employeeList.add(addEmployee);
    }

    //add by index
    public void addEmployeeByIndex(int index,EmployeeArrayList addEmployee){
        employeeList.add(index,addEmployee);
    }

    //update
    //add by index
    public void updateEmployeeByIndex(int index,EmployeeArrayList updateEmployee){
        employeeList.set(index,updateEmployee);
    }

    //delete
    public EmployeeArrayList removeEmployeeById(int employeeById){
        return  employeeList.remove(employeeById);
    }

    //total of employees
    public int getTotalNoOfEmployees(){
        return employeeList.size();
    }

    //empty
    public boolean isEmpty(){
        return employeeList.isEmpty();
    }

    //printing all of the employees
    public void printAllEmployees(){
        for(EmployeeArrayList emp : employeeList){
            System.out.println(" - " + emp);
        }
    }
}
