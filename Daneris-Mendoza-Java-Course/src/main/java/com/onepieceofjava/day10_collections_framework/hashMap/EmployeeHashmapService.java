package com.onepieceofjava.day10_collections_framework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashmapService {

    private HashMap<Integer,EmployeeHashMap> employeeHashMap;

    public EmployeeHashmapService() {
        employeeHashMap = new HashMap<>();
    }

    //get
    public EmployeeHashMap getEmployeeById(int id){
        return employeeHashMap.get(id);
    }

    //add
    public EmployeeHashMap addEmployee(EmployeeHashMap addEmployee){
        return employeeHashMap.put(addEmployee.getId(),addEmployee);
    }

    //remove
    public EmployeeHashMap removeEmployeeById(int id){
        return employeeHashMap.remove(id);
    }

    //update
    public void updateEmployeeById(int id,String name, String dept){
        if(employeeHashMap.containsKey(id)){
            employeeHashMap.put(id,new EmployeeHashMap(id,name,dept));
        }

    }

    public void displayEmployee(){
        for(Map.Entry<Integer,EmployeeHashMap> entry : employeeHashMap.entrySet()){
            System.out.println("Id: " + entry.getKey() + " , " + entry.getValue());
        }
    }

    //exist
    public boolean hasEmployee(int id){
        return employeeHashMap.containsKey(id);
    }

    //count
    public int getTotalEmployee(){
        return employeeHashMap.size();
    }


}
