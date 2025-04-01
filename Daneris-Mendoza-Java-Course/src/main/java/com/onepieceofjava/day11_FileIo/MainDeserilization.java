package com.onepieceofjava.day11_FileIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserilization {
    public static void main(String[] args) {

        EmployeeFileIO employee  = null;

        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Mugiwara\\Documents\\Employee File Output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            employee = (EmployeeFileIO) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

            System.out.println("Deserialized Employee File Output.txt....");
            System.out.println("First name of employee: " + employee.name);
            System.out.println("Address of employee: " + employee.address);

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
