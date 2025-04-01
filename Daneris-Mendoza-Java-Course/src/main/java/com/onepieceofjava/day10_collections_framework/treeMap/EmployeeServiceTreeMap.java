package com.onepieceofjava.day10_collections_framework.treeMap;

import com.onepieceofjava.day10_collections_framework.hashMap.EmployeeHashMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceTreeMap {

    private TreeMap<Integer,EmployeeTreeMap> employeeTreeMap;

    public EmployeeServiceTreeMap() {
        employeeTreeMap = new TreeMap<>();
    }

    //get
    public EmployeeTreeMap getEmployeeById(int id){
        return employeeTreeMap.get(id);
    }

    //get first
    public EmployeeTreeMap getFirstEmployee(){
        return  employeeTreeMap.firstEntry().getValue();
    }

    //get last
    public EmployeeTreeMap getLastEmployee(){
        return  employeeTreeMap.lastEntry().getValue();
    }

    //add
    public EmployeeTreeMap addEmployee(EmployeeTreeMap addEmployee){
        return employeeTreeMap.put(addEmployee.getId(),addEmployee);
    }

    //remove
    public EmployeeTreeMap removeEmployeeById(int id){
        return employeeTreeMap.remove(id);
    }

    //update
    public void updateEmployeeById(int id,String name, String dept){
        if(employeeTreeMap.containsKey(id)){
            employeeTreeMap.put(id,new EmployeeTreeMap(id,name,dept));
        }

    }

    public void displayEmployee(){
        for(Map.Entry<Integer,EmployeeTreeMap> entry : employeeTreeMap.entrySet()){
            System.out.println("Id: " + entry.getKey() + " , " + entry.getValue());
        }
    }

    //exist
    public boolean hasEmployee(int id){
        return employeeTreeMap.containsKey(id);
    }

    //count
    public int getTotalEmployee(){
        return employeeTreeMap.size();
    }
}
