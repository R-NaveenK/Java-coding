package com.Questions;

import java.util.Scanner;

public class Q31InterQ7 {
    //Power In Java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ; ");
        int a = in.nextInt();
        System.out.println("enter the power ; ");
        int b = in.nextInt();
        System.out.println("Power of " + a + " is " + Math.pow(a,b));
    }

}
