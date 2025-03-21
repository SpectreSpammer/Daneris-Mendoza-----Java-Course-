package com.onepieceofjava.day9_exceptions.error;

import java.util.ArrayList;
import java.util.List;

public class MainErrorException {
    public static void main(String[] args) {


        try{
            recursiveMethod(1);
        }catch (StackOverflowError e){
            System.out.println("Caught an exception: " + e.getMessage());
        }


        outOfMemoryError();
    }

    private static void recursiveMethod(int i) {
        System.out.println(i);
        recursiveMethod(i + 1);
    }

    private static void outOfMemoryError() {
        List<byte[]> listOfBytes = new ArrayList<>();
        while(true){
            listOfBytes.add(new byte[1024 * 1024]);
        }
    }
}
