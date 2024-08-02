package com.Questions;

import java.util.Scanner;

public class Q31InterQ12 {
    //Calculate Average Marks
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum = 0 ;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your mark : ");
            float mark = in.nextFloat();
            sum += mark ;
        }
        float ans = sum / 5 ;
        System.out.println("Average of your mark is : " + ans);
    }
}
