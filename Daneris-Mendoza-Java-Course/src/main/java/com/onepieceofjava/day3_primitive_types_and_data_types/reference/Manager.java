package com.onepieceofjava.day3_primitive_types_and_data_types.reference;

public class Manager implements EmployeeReference {


    @Override
    public void work() {
        System.out.println("Manager is leading the meeting.");
    }

    @Override
    public void lunch() {
        System.out.println("Manager is having his lunch.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is facilitating the meeting.");
    }
}
