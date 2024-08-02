package com.Questions;

import java.util.Scanner;

public class Q43 {
    /*
    A person is eligible to vote if his/her age is greater than or equal to 18.
     Define a method to find out if he/she is eligible to vote.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int num1 = in.nextInt();
        vot(num1);
    }

    static void vot(int num1) {
        if(num1 > 17) System.out.println("You can vote");
        else{
            System.out.println("You need to for " + (18 - num1) + " year's");
        }
    }
}
