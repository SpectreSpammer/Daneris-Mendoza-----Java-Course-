package com.onepieceofjava.day9_exceptions.uncheckedException;

public class MainUncheckedException {
    public static void main(String[] args) {

        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try{
            int [] arr = new int[5];
            System.out.println(arr[6]);
        }catch (Exception e){
            System.out.println("Caught an exception: " + e.getMessage());
        }



    }
}
