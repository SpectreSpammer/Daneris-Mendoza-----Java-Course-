package com.onepieceofjava.Daneris_Springboot.service;

import com.onepieceofjava.Daneris_Springboot.model.Assets;
import com.onepieceofjava.Daneris_Springboot.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private List<Employee> employeeList = new ArrayList<>();
    private List<Assets> assetsList = new ArrayList<>();
    private Long employeeId = 101L;
    private Long assetId = 201L;

    public InventoryService() {
        initializedEmployees();
    }


    private void initializedEmployees() {
        addEmployee(new Employee(null, "daneris", "backdev"));
        addEmployee(new Employee(null, "nan", "frontend"));
        addEmployee(new Employee(null, "nami", "sales"));
        addEmployee(new Employee(null, "robin", "HR"));
        addEmployee(new Employee(null, "sanji", "kitchen"));

        addAssets(new Assets(null,"lenovo","backend laptop","lnv12345"));
        addAssets(new Assets(null,"msi","frontend laptop","msi12345"));
        addAssets(new Assets(null,"macbook","sales laptop","mc12345"));
        addAssets(new Assets(null,"asus","hr laptop","asus12345"));
        addAssets(new Assets(null,"acer","kitchen laptop","acr12345"));

    }

    //======================EMPLOYEE====================
    //GET ALL
    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    //GET BY ID
    public Employee getEmployeeById(Long employeeId){
        return employeeList.stream().filter(e -> e.getId().equals(employeeId)).findFirst().orElse(null);

    }


    //ADD
    public Employee addEmployee(Employee addemployee) {
        addemployee.setId(employeeId++);
        if (addemployee.getAssetsList() != null && !addemployee.getAssetsList().isEmpty()) {
            for (Assets assets : addemployee.getAssetsList()) {
                assets.setId(assetId++);

            }
        }
        employeeList.add(addemployee);
        return addemployee;

    }

    //UPDATE
    public Employee updateEmployee(Long id,Employee updateEmployee){
        for(int i=0; i<employeeList.size();i++){
            if(employeeList.get(i).getId().equals(id)){
                updateEmployee.setId(id);
                employeeList.set(i,updateEmployee);
                return updateEmployee;
            }
        }

        return null;
    }

    //DELETE
    public void removeEmployeeById(Long employeeId){
        employeeList.removeIf(e -> e.getId().equals(employeeId));
    }


    //====================ASSETS==========================
    //ADD
    private Assets addAssets(Assets assets) {
        assets.setId(assetId++);
        assetsList.add(assets);
        return assets;
    }
}
