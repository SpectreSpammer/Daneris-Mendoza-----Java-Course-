package com.onepieceofjava.day10_collections_framework.hashSet;

import java.util.HashSet;

public class EmployeeHashSetService {

    HashSet<EmployeeHashSet> employeeHashSets;

    public EmployeeHashSetService() {
      employeeHashSets = new HashSet<>();
    }

    //add
    public boolean addEmployee(EmployeeHashSet addEmployee){
        return  employeeHashSets.add(addEmployee);

    }

    //remove
    public boolean removeEmployee(EmployeeHashSet removeEmployee){
        return  employeeHashSets.remove(removeEmployee);

    }

    public boolean containsEmployee(EmployeeHashSet containsEmployee){
        return employeeHashSets.contains(containsEmployee);
    }

    public void printEmployees(){
        System.out.println("Current employees:");
        for(EmployeeHashSet employee : employeeHashSets){
            System.out.println(" - " + employee);
        }
    }

    public int getTotalEmployees(){
        return employeeHashSets.size();
    }

}
