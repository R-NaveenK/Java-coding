package com.Questions;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        //  Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);
        System.out.print("Rupees : ");
        double ind = in.nextInt();

        double x = ind * 0.011974 ;
        System.out.println("$"+ x);

    }
}
