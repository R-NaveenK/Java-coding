package com.Questions;

import java.util.Scanner;

public class Q48 {
    //Write a program that will ask the user to enter his/her marks (out of 100). Define a
    // method that will display grades according to the marks entered as below:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a mark : ");
        int num = in.nextInt();
        grade(num);
    }

    static void grade(int num) {
        if((num > 90) && (num <= 100)){
            System.out.println("Grade : AA");
        }else if((num > 80) && (num <= 90)){
            System.out.println("Grade : AB");
        }else if((num > 70) && (num <= 80)){
            System.out.println("Grade : BB");
        }else if((num > 60) && (num <= 70)){
            System.out.println("Grade : BC");
        }else if((num > 50) && (num <= 60)){
            System.out.println("Grade : CD");
        }else if((num > 40) && (num <= 50)){
            System.out.println("Grade : DD");
        }else if(num <= 40 ){
            System.out.println("Grade : AA");
        }else{
            System.out.println("INVALID");
        }

    }

}
