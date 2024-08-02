package com.Questions;

import java.util.Scanner;

public class Q31InterQ25 {
    //Naveen is allowed to go out with his friends only on the even days of a given month.
    //Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = 0 ;
        for (int i = 1; i <= 31; i++) {
            if(i % 2 == 0) {
                num++;
            }
        }
        System.out.println("Naveen can go out with his friends " + num) ;
    }

}
