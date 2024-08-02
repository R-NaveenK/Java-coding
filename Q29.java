package com.Questions;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
//        To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a starting : ");
        int a = in.nextInt();
        System.out.println("Enter a ending : ");
        int b = in.nextInt();
        for (int i = a; i < b; i++) {
            if(isam(i)){
                System.out.println(i);
            }

        }
    }

     static boolean isam(int i) {
        int org = i ;
        int sum = 0;

        while (i > 0 ){
            int rem = i % 10 ;
            i = i / 10 ;
            sum = sum + rem * rem * rem ;
        }
        return sum == org ;
    }
}
