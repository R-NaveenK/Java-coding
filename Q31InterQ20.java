package com.Questions;

import java.util.Scanner;

public class Q31InterQ20 {
    //LCM Of Two Numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter a number2 : ");
        int num2 = in.nextInt();
        int min = Math.min(num1, num2);
        while(true) {
            if ((min % num1) == 0 && (min % num2) == 0) {
                System.out.println("LCM is : "+ min);
                break ;
            }
            min++;
        }
    }
}
