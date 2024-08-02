package com.Questions;

import java.util.Scanner;

public class Q31InterQ4 {
    //Calculate Discount Of Product
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the list price : ");
        int list = in.nextInt();
        System.out.println("Enter the selling price : ");
        int sell = in.nextInt();
        int dis = list - sell ;
        System.out.println("Discount is " + dis);
    }
}
