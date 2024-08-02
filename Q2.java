package com.Questions;

import java.util.Scanner;


public class Q2 {
    /*
    Take two numbers and print the sum of both.

    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num 1 : ");
        int a = in.nextInt();
        System.out.println("Enter a num 2 : ");
        int b = in.nextInt();

        int c = a + b ;
        System.out.println("Sum of num1 and num2 is " + c);

    }

}
