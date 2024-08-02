package com.Questions;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
    /*
         Write a program to input principal, time, and rate (P, T, R) from the user and
         find Simple Interest.
        */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        int p = in.nextInt();
        System.out.print("Enter the rate ; ");
        int r = in.nextInt();
        System.out.print("Enter the time : ");
        int t = in.nextInt();

        double x = p * r * t ;
        System.out.println("Simple interest is " + x / 100);


    }
}
