package com.Questions;

import java.util.Scanner;

public class Q31interQ24 {
    //Sum Of A Digits Of Number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int sum = 0;
        while(num > 0){
            int rem = num % 10 ;
            sum += rem ;
            num = num / 10 ;
        }
        System.out.println(sum);
    }
}
