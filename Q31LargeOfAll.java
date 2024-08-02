package com.Questions;

import java.util.Scanner;

public class Q31LargeOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int large = 0 ;
        while(true){
            System.out.print("Enter a  number : ");
            int a = in.nextInt();
            large = Math.max(large,a);
            if(a == 0){
                System.out.println("Program ends...");
                break;
            }
        }
        System.out.println(large);
    }
}
