package com.Questions;

import java.util.Scanner;

public class Q31InterQ17 {
    //Find if a number is palindrome or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        int n = 0 , temp = num;
        while(num > 0){
            int rem = num % 10 ;
            n = n * 10 + rem ;
            num = num / 10 ;
        }
        if(n == temp ){
            System.out.println("It is palindrome : " + n);
        }else{
            System.out.println("It is not palindrome : " + n);
        }
    }
}
