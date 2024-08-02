package com.Questions;

import java.util.Scanner;

public class Q31InterQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the kWh of the 1month : ");
        int kw1 = in.nextInt();
        System.out.print("Enter the kWh of the 2month : ");
        int kw2 = in.nextInt();

        int x = kw2 - kw1 ;
        System.out.println("Your electrical bill is rupees " + x * 6);
    }
}
