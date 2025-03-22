package com.onepieceofjava.day10_collections_framework.treeSet;

import com.onepieceofjava.day10_collections_framework.arrayList.EmployeeArrayList;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceTreeSet {
    private TreeSet<EmployeeTreeSet> employeeTreeSets;

    public EmployeeServiceTreeSet() {
        employeeTreeSets = new TreeSet<>();
    }

    public EmployeeServiceTreeSet(Comparator<EmployeeTreeSet> comparator) {
       employeeTreeSets = new TreeSet<>(comparator);
    }

    //add
    public boolean addEmployee(EmployeeTreeSet employee){
        return employeeTreeSets.add(employee);
    }

    //remove
    public boolean removeEmployee(EmployeeTreeSet employee){
        return employeeTreeSets.remove(employee);
    }

    //get first
    public EmployeeTreeSet getFirstEmployee(){
        return  employeeTreeSets.first();
    }

    //get last
    public EmployeeTreeSet getLastEmployee(){
        return  employeeTreeSets.last();
    }

    //printing all of the employees
    public void printAllEmployees(){
        for(EmployeeTreeSet emp : employeeTreeSets){
            System.out.println(" - " + emp);
        }
    }

}
