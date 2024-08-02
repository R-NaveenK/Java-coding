package com.Questions;

import java.util.Scanner;

public class Q41 {
    /*
    Define two methods to print the maximum
     and the minimum number respectively
     among three numbers entered by the user.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter a number2 : ");
        int num2 = in.nextInt();
        System.out.println("Enter a number3 : ");
        int num3 = in.nextInt();

        int max = maxi(num1,num2,num3);
        int min = mini(num1,num2,num3);

        System.out.println("Maximum of 3 numbers is : " + max);
        System.out.println("Minimum of 3 numbers is : " + min);

    }

    static int mini(int num1, int num2, int num3) {
        int ans = Math.min(Math.min(num1,num2),num3);
        return ans ;
    }

    static int maxi(int num1, int num2, int num3) {
        int ans = Math.max(Math.max(num1,num2),num3);
        return ans ;
    }
}
