package com.Questions;

import java.util.Scanner;

public class Q1 {
    //Input a year and find whether it is a leap year or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int a = in.nextInt();

        if (((a % 100) != 0)&&((a % 4) == 0)) {
            System.out.println("It is a leap year");
        } else System.out.println("It is not leap year ");
    }


}
