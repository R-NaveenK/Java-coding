package com.Questions;

import java.util.Scanner;

public class Q31InterQ3 {
    //Calculate Average Of N Numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0 , num = 0 ;
        while(true){
            System.out.print("Enter a number ; ");
            int a = in.nextInt();
            num += a ;
            if(a == 0) break;
            i++;
        }
        System.out.println("Average is " + num / i);
    }
}