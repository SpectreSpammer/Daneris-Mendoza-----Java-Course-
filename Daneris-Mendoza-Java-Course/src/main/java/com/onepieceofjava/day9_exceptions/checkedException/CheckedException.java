package com.onepieceofjava.day9_exceptions.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckedException {

    //readfile
    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        new Scanner(file);
    }

    //connect to database
    public static void connectToDatabase(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/daneris","user","12345");

        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }finally {
            System.out.println("Close the database");
        }
    }
}
