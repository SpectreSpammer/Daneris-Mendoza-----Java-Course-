package com.onepieceofjava.Daneris_Springboot.controller;


import com.onepieceofjava.Daneris_Springboot.model.Employee;
import com.onepieceofjava.Daneris_Springboot.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {


    private final InventoryService inventoryService;

    public InventoryController() {
        this.inventoryService = new InventoryService(); //manually injected dependencies
    }


    //=================EMPLOYEES

    //GET ALL
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return inventoryService.getAllEmployees();
    }

    //GET BY ID
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable Long employeeId){
        return inventoryService.getEmployeeById(employeeId);
    }

    //ADD
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee addEmployee){
        return inventoryService.addEmployee(addEmployee);
    }

    //UPDATE
    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployeeById(@PathVariable Long employeeId,@RequestBody Employee updateEmployee){
        return inventoryService.updateEmployee(employeeId,updateEmployee);
    }


    //GET BY ID
    @DeleteMapping("/employees/{employeeId}")
    public void  removeEmployeeById(@PathVariable Long employeeId){
         inventoryService.removeEmployeeById(employeeId);
    }

}
