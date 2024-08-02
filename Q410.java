package com.Questions;

import java.util.Scanner;

public class Q410 {
    //Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int ans = palin(num) ;
        if(num == ans ){
            System.out.println("It is palindrome : " + ans);
        }else{
            System.out.println("It is not palindrome : " + ans);
        }
}

    static int palin(int num) {
        int n = 0 ;
        while(num > 0){
            int rem = num % 10 ;
            n = n * 10 + rem ;
            num = num / 10 ;
        }return n ;

    }
}
