package com.Questions;

import java.util.Scanner;

public class Q47 {
    //Define a method to find out if a number is prime or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        prime(num);
        }

    static void prime(int num) {
        int n = 2 ;
        if(num < n){
            System.out.println("Neither prime nor composite");
        }
        while(n*n < num){
            if(num % n == 0) {
                System.out.println("Not prime");
                break;
            }
            n++;
        }
        if(num % n != 0 ){
            System.out.println("Prime");
        }
    }
}
