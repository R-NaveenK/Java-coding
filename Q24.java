package com.Questions;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
   /*
        Take in two numbers and an operator (+, -, *, /) and calculate the value.
         (Use if conditions)
    */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num1  : ");
        int a = in.nextInt();
        System.out.println("Enter a num2  : ");
        int b = in.nextInt();
        System.out.println("Enter the operator( + , - , * , / ) : ");
        char o = in.next().trim().charAt(0);

        if(o == '+') System.out.println(a + b);
        if(o == '-') System.out.println(a - b);
        if(o == '*') System.out.println(a * b);
        if(o == '/') System.out.println(a / b);






    }
}
