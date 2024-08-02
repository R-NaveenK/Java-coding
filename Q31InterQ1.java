package com.Questions;

import java.util.Scanner;

public class Q31InterQ1 {
    //Factorial Program In Java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if(num == 1 || num == 0){
            System.out.println("Factorial of " + num + " is " + 1 );
        }
        int temp = num;
        int n = 1 ;
        while(num > 0 ){
            n *= num;
            num--;
        }
        System.out.println("Factorial of " + temp + " is " + n );
    }
}
