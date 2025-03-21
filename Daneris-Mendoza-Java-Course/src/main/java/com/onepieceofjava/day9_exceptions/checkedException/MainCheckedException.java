package com.onepieceofjava.day9_exceptions.checkedException;

import java.io.FileNotFoundException;

public class MainCheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        CheckedException.readFile("C:\\Users\\Mugiwara\\Downloads\\Website\\RNPC");
        CheckedException.connectToDatabase();
    }
}
