package com.Questions;

import java.util.Scanner;

public class Q31InterQ8 {
    //Calculate Depreciation of Value
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter v1 : ");
        double v = in.nextInt();
        System.out.print("Enter r : ");
        double r = in.nextInt();
        System.out.print("Enter t : ");
        double t = in.nextInt();
        float d = (float)(v * Math.pow((1 - r / 100), t) );
        System.out.println(d);


    }

}
