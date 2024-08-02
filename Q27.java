package com.Questions;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        // To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = in.nextInt();
        int x = 0 ;
        int y = 1 ;

        for (int i = 2; i <= n; i++) {
            int temp = y ;
            y = y + x ;
            x = temp ;
        }
        System.out.println("Fibonacci series is " + y);

    }
}
