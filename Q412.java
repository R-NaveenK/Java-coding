package com.Questions;

import java.util.Scanner;

public class Q412 {
    //Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = in.nextInt();
        System.out.print("Enter a number : ");
        int num2 = in.nextInt();
        prime(num1 , num2);
    }

    static void prime(int num1 , int num2) {
        for (int i = num1; i <= num2 ; i++) {
            if( i == 0  || i == 1){
                continue;
            }
            int prime = 1 ;
            for (int j = 2; j <= i / 2 ; j++) {
                if(i % j == 0 ){
                    prime = 0 ;
                    break;
                }
            }
            if(prime == 1){
                System.out.print(i + " ");
            }
        }
    }
}
