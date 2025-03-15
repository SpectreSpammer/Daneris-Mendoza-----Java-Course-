package com.onepieceofjava.day5_control_flow.decisionMaking;

public class MainSwitchStatement {
    public static void main(String[] args) {

        //String switch
        String dept = "pR";

        switch (dept.toLowerCase()){

            case "it":
                System.out.println("Department: IT");
                break;

            case "hr":
                System.out.println("Department: HR");
                break;

            case "pr":
                System.out.println("Department: PR");
                break;

            default:
                System.out.println("Department: Admin");
        }

        //Integer switch
        int deptCode = 312312;

        switch (deptCode){

            case 101:
                System.out.println("Your dept code is: 101");
                break;
            case 102:
                System.out.println("Your dept code is: 102");
                break;
            case 103:
                System.out.println("Your dept code is: 103");
                break;
            default:
                System.out.println("Your dept code is invalid");

        }

    }
}
