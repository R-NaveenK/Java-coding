package com.Questions;

import java.util.Scanner;

public class Q31InterQ15 {
    //Find nCr & nPr
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = in.nextInt();
        System.out.println("Enter the r : ");
        int r = in.nextInt();
        int min = n - r ;
        int a = fact(n);
        int b = fact(r);
        int c = fact(min);
        int ncr = a / (b * c);
        int npr = a / c ;
        System.out.println("nCr = "+ ncr);
        System.out.println("nPr = "+ npr);

    }

    static int fact(int num) {
        int n = 1;
        while(num > 0 ){
            n *= num;
            num--;
        }
        return(n);

    }


}
