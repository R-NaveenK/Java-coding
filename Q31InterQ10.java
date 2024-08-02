package com.Questions;

import java.util.Scanner;

public class Q31InterQ10 {
    //Calculate CGPA
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many semesters do you have : ");
        float sem = in.nextInt();
        float p = 0 ;
        for (int i = 1; i <= sem ; i++) {
            System.out.print("Enter the mark of " + i + " semester percentage : ");
            float sum = in.nextInt();
            p += sum ;
        }
        float j = (float) (( p / sem) / 9.5);
        System.out.println("Your CGPA is : " + j);
    }
}
