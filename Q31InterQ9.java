package com.Questions;

import java.util.Scanner;

public class Q31InterQ9 {
    //Calculate Batting Average
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of hits : ");
        double hit = in.nextInt();
        System.out.print("Enter number of at-bat : ");
        double atbat = in.nextInt();
        double i = hit / atbat ;
        System.out.println(i);



    }
}
