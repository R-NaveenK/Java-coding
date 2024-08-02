package com.Questions;

import java.util.Scanner;

public class Q31InterQ19 {
    //HCF Of Two Numbers Program
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter a number2 : ");
        int num2 = in.nextInt();
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
        while(min > 0){
            int temp = 0 , c = 0 ;
            c = max % min ;
            if (c == 0 ) {
                System.out.println("HCF is "+min);
            }
            temp = min ;
            min = c ;
            max = temp;
        }

    }
}
