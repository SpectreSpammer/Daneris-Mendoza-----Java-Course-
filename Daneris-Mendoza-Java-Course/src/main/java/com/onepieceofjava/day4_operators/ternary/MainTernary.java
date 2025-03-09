package com.onepieceofjava.day4_operators.ternary;



public class MainTernary {
    public static void main(String[] args) {

     //condition ? expression1 : expression2

        int age = 29;
        System.out.println(age < 65 ?  "not yet retired" : "retired");

        boolean isReceivedTheBonus = true;
        String receivedBonus = isReceivedTheBonus ? " received bonus" : "not yet received the bonus";
        System.out.println("Daneris has: " + receivedBonus);
    }
}
