package com.Questions;

import java.util.Scanner;

public class Q46 {
    /*
    Write a program to print the circumference and area of a circle
    of radius entered by user by defining your own method.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius : ");
        float num1 = in.nextInt();
        area(num1);
    }
    static void area(float num1) {
        System.out.println("Circumference is " + (2 * 3.14 * num1));
        System.out.println("Area is " + (3.14 * num1 * num1));
    }
}

