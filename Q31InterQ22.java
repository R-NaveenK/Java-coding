package com.Questions;

import java.util.Scanner;

public class Q31InterQ22 {
    //Perfect Number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number1 : ");
        int num1 = in.nextInt();
        int sum = 0 ;
        for (int i = 1; i < num1; i++) {
            if ((num1 % i)==0){
                sum += i ;
            }
        }
        if(sum == num1){
            System.out.println("It is a Perfect Number " + sum);
        }
        else{
            System.out.println("It is not a Perfect Number " + sum);
        }
    }
}
