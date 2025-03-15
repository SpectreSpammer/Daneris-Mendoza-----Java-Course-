package com.onepieceofjava.day5_control_flow.loopStatement;

public class MainWhile {
    public static void main(String[] args) {

        int yearsOfService = 1;
        int performanceRating = 8;
        boolean isPromotionEligible = false;

        System.out.println("Years until is eligible for promotion");
        while(!isPromotionEligible){
            if(yearsOfService >= 5 || (yearsOfService >=3 && performanceRating >=6)){
                isPromotionEligible = true;
                System.out.println("Employee is eligible for promotion");
            }else {
                yearsOfService++;
                System.out.println("Years of service: " + yearsOfService);
            }

        }
    }
}
