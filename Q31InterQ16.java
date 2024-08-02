package com.Questions;

import java.util.Scanner;

public class Q31InterQ16 {
    //Reverse A String In Java
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.next() ;
        String s = "";;
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s ;
        }
        System.out.println(s);
    }
}
