package com.Questions;

import java.util.Scanner;

public class Q31InterQ21 {
    //Java Program Vowel Or Consonant
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = in.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("Consonant");
        }

    }
}
