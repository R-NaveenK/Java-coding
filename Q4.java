package com.Questions;

import java.util.Scanner;


public class Q4 {
    //            Take 2 numbers as inputs and find their HCF and LCM.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int temp = 0 , c = 0 ;

        //HCF of a and b
        while(min > 0){

            c = max % min ;
            if (c == 0 ) {
                System.out.println("HCF is "+min);
            }
            temp = min ;
            min = c ;
            max = temp;

        }
        int lcm = a*b/max ;
        System.out.println("LCM is "+ lcm);
    }
}
