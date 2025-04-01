package com.onepieceofjava.day10_collections_framework.treeMap;

public class EmployeeTreeMap {

    private int id;
    private String name;
    private String dept;

    public EmployeeTreeMap(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "EmployeeTreeMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
