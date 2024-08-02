package com.Questions;


import java.util.Scanner;

public class Q5 {
    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0 ;
        while(true){

            System.out.println("Enter a  number : ");
            int a = in.nextInt();
            sum = sum + a;
            if(a == 0){

                System.out.println("Program ends...");
                break;
            }


        }
        System.out.println(sum);

    }
}
