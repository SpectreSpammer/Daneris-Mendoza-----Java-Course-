package com.onepieceofjava.Daneris_Springboot.model;



import java.util.ArrayList;
import java.util.List;

public class Employee {
    private Long id;
    private String name;
    private String dept;
    private List<Assets> assetsList;

    public Employee() {
        this.assetsList = new ArrayList<>();
    }

    public Employee(Long id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.assetsList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Assets> getAssetsList() {
        return assetsList;
    }

    public void setAssetsList(List<Assets> assetsList) {
        this.assetsList = assetsList;
    }

    public void addAsset(Assets assets){
        this.assetsList.add(assets);
    }

    public void removeAsset(Assets assets){
        this.assetsList.remove(assets);
    }
}
