package com.Questions;

import java.util.Scanner;

public class Q42 {
    //Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int num1 = in.nextInt();
        int eoro = evo(num1);
        if(eoro != 0 )System.out.println("ODD");
        else System.out.println("EVEN");
    }

    static int evo(int num) {
        return (num % 2) ;
    }
}
