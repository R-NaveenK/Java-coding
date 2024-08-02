package com.Questions;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
// Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = in.nextInt();
        if (a % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


    }
}
