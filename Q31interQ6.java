package com.Questions;

import java.util.Scanner;

public class Q31interQ6 {
    //Calculate Commission Percentage
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the commission amount : ");
        double com = in.nextInt();
        System.out.println("Enter the sale price : ");
        double sale = in.nextInt();
        double comper =  com / sale * 100 ;
        System.out.println("Commission percentage is " + comper + "%");

    }
}
