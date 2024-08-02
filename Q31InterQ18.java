package com.Questions;

import java.util.Scanner;

public class Q31InterQ18 {
    // Future Investment Value
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the present value : ");
        float pv = in.nextFloat();
        System.out.println("Enter the Interest rate : ");
        float r = in.nextFloat();
        System.out.println("Enter the number of compounding periods : ");
        float n = in.nextFloat();
        double ans = (pv * r / 100 * n) + pv;
        System.out.println(ans);

    }
}
