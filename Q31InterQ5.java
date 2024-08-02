package com.Questions;

import java.util.Scanner;

public class Q31InterQ5 {
    //Calculate Distance Between Two Points
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x1 : ");
        int x1 = in.nextInt();
        System.out.println("Enter the y1 : ");
        int y1 = in.nextInt();
        System.out.println("Enter the x2 ; ");
        int x2 = in.nextInt();
        System.out.println("Enter the y2 ; ");
        int y2 = in.nextInt();
            int m = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        double distance = Math.pow(m,0.5) ;
        System.out.println("Distance is : " + distance);
    }
}
