package com.Questions;

import java.util.Scanner;

public class Q44 {
    //Write a program to print the sum of two numbers entered
    //by user by defining your own method.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter a number2 : ");
        int num2 = in.nextInt();
        sum(num1 , num2);
    }

    static void sum(int num1 , int num2) {
        System.out.println(num1 + num2);
    }
}