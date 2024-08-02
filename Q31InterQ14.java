package com.Questions;

import java.util.Scanner;

public class Q31InterQ14 {
    //Armstrong Number In Java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int temp = n ;
        int sum = 0 ;
        while(n > 0) {
            int rem = n % 10 ;
            sum = sum + rem * rem * rem ;
            n = n / 10 ;
        }
        if(sum == temp){
            System.out.println("It is an armstrong number");
        }else{
            System.out.println("It is not an armstrong number");
        }

    }
}
