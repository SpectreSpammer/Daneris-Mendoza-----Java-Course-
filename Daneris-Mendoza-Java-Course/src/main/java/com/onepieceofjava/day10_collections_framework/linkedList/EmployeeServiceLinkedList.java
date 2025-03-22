package com.onepieceofjava.day10_collections_framework.linkedList;

import java.util.LinkedList;

public class EmployeeServiceLinkedList {

    private LinkedList<EmployeeLinkedList> employeeLinkedList;


    public EmployeeServiceLinkedList() {
       employeeLinkedList = new LinkedList<>();
    }

    //get last
    public EmployeeLinkedList getLastEmployee(){
        return  employeeLinkedList.getLast();
    }

    //get first
    public EmployeeLinkedList getFirstEmployee(){
        return  employeeLinkedList.getFirst();
    }

    //get by id
    public EmployeeLinkedList getEmployeeById(int index){
        return  employeeLinkedList.get(index);
    }


    //add by object
    public void addEmployee(EmployeeLinkedList addEmployee){
          employeeLinkedList.add(addEmployee);
    }

    //add by index
    public void addEmployeeByIndex(int index,EmployeeLinkedList addEmployee){
        employeeLinkedList.add(index,addEmployee);
    }

    //update
    //add by index
    public void updateEmployeeByIndex(int index,EmployeeLinkedList updateEmployee){
        employeeLinkedList.set(index,updateEmployee);
    }

    //delete
    public EmployeeLinkedList removeEmployeeById(int employeeById){
        return  employeeLinkedList.remove(employeeById);
    }

    //total of employees
    public int getTotalNoOfEmployees(){
        return employeeLinkedList.size();
    }

    //empty
    public boolean isEmpty(){
        return employeeLinkedList.isEmpty();
    }

    //printing all of the employees
    public void printAllEmployees(){
        for(EmployeeLinkedList emp : employeeLinkedList){
            System.out.println(" - " + emp);
        }
    }
}
