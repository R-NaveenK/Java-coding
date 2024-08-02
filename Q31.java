package com.Questions;

import java.util.Scanner;

public class Q31 {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lar = 0 ;
        while (true) {

            System.out.print("Enter a  number : ");
            int a = in.nextInt();
            if (a == 0) {

                System.out.println("Program ends...");
                System.out.println("Largest number is " + lar);
                break;
            }
            if (a > lar){
                lar = a ;
            }


        }


    }
}
