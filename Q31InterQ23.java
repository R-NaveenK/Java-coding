package com.Questions;

import java.util.Scanner;

public class Q31InterQ23 {
    //Check Leap Year Or Not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if((num % 4) == 0){
            if((num % 100) != 0 || (num % 400) == 0){
                System.out.println("It is a leap year");
            }else System.out.println("It is not a leap year");
        }else System.out.println("It is not a leap year");
    }
}
