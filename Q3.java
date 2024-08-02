package com.Questions;

import java.util.Scanner;

public class Q3 {
//    Take a number as input and print the multiplication table for it.

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int a = in.nextInt();

    for (int i = 1; i < 11; i++) {
        int c = i * a ;
        System.out.println(i + " * "+ a + " = " + c);

    }
    }
}
