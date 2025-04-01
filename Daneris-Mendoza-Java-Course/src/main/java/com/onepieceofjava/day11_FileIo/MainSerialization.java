package com.onepieceofjava.day11_FileIo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class MainSerialization {
    public static void main(String[] args) {

        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());
        EmployeeFileIO employee = new EmployeeFileIO();
        employee.name = "daneris";
        employee.address = "Pasig";

        try{

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Mugiwara\\Documents\\Employee File Output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in the Employee File output.txt");
            LOGGER.info("The file has been created successfully as Employee File Output.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
