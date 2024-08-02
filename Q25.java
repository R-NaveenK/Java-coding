package com.Questions;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int a = in.nextInt();
        System.out.println("Enter a num2 : ");
        int b = in.nextInt();
        System.out.println("Largest number is " + Math.max(a,b));


    }
}
