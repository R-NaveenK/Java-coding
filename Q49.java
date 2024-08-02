package com.Questions;

import java.util.Scanner;

public class Q49 {
    /*
    Write a program to print the factorial of a number by defining a method named
     'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        fact(num);
    }

    static void fact(int num) {
        if(num == 1 || num == 0){
            System.out.println("Factorial of " + num + " is " + 1 );
        }else{
        int temp = num;
        int n = 1 ;
        while(num > 0 ){
            n *= num;
            num--;
        }
        System.out.println("Factorial of " + temp + " is " + n );
        }
    }
}
