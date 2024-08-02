package com.Questions;

import java.util.Scanner;

public class Q31InterQ26 {
    /*
    Write a program to print the sum of negative numbers, sum of positive even numbers
     and the sum of positive odd numbers from a list of numbers (N) entered by the user.
     The list terminates when the user enters a zero.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0 , pe = 0 , po = 0 ;
        while(true){
            System.out.print("Enter a number : ");
            int num = in.nextInt();
            if(num == 0){
                System.out.println("The sum of negative numbers is : " + n);
                System.out.println("The sum of positive even numbers is : " + pe);
                System.out.println("The sum of positive odd numbers is : " + po);
                System.out.println("Program ends.........");
                break;
            }else if (num < 0 ){
                n += num ;
            }else if (num % 2 == 0){
                pe += num;
            }else{
                po += num;
            }
        }

    }
}
