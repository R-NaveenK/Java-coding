package com.Questions;

import java.util.Scanner;

public class Q31InterQ13 {
    //Sum Of N Numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sum = 0 ;
        float mark = 1 ;
        while(mark > 0 ) {
            System.out.print("Enter a number : ");
            mark = in.nextFloat();
            sum += mark ;
        }
        System.out.println("Average of your mark is : " + sum);

    }
}
