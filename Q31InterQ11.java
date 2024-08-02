package com.Questions;

import java.util.Scanner;

public class Q31InterQ11 {
    //Compound Interest
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        double p = in.nextDouble();
        System.out.print("Enter the rate : ");
        double r = in.nextDouble();
        System.out.print("Enter the time  : ");
        double t = in.nextDouble();
        double a = p * Math.pow((1 + (r / 100)) , t) ;
        System.out.println(a);
    }
}
