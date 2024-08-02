package com.Questions;

import java.util.Scanner;

public class Q45 {
    //Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter a number2 : ");
        int num2 = in.nextInt();
        System.out.println(pro(num1 , num2));
    }
    static int  pro(int num1 , int num2) {
        return(num1 * num2);
    }

}
