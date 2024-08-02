package com.Questions;

import java.util.Scanner;

public class Q31ProMinusSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int pro = 1 , sum = 0 ;
        while(num > 0){
            int rem = num % 10 ;
            pro *= rem ;
            sum += rem ;
            num = num / 10 ;
        }
        int n = pro - sum ;
        System.out.println("Answer is " + n);


    }
}
