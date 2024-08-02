package com.Questions;

import java.util.Scanner;

public class Q31easyShapesArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the shape : ");
            String shape = in.next();
            if (shape.equals("circle")) {
                circle();
            } else if (shape.equals("triangle")) {
                triangle();
            } else if (shape.equals("rectangle")) {
                rectangle();
            } else if (shape.equals("isosceles triangle")) {
                isoscelestriangle();
            } else if (shape.equals("parallelogram")) {
                parallelogram();
            } else if (shape.equals("rhombus")) {
                rhombus();
            } else if (shape.equals("equilateral triangle")) {
                equilateraltriangle();
            } else {
                System.out.println("PROGRAM ENDS ....");
                break;
            }
        }
    }

    static void equilateraltriangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double r = in.nextInt();
        double area = 0.433 * r * r ;
        System.out.println("Area of the equilateral triangle is " + area);
    }

    static void rhombus() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diagonal 1 : ");
        double d1 = in.nextInt();
        System.out.print("Enter the diagonal 2 : ");
        double d2 = in.nextInt();
        double area = 0.5 * d1 * d2 ;
        System.out.println("Area of the rhombus is " + area);
    }

    static void parallelogram() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height : ");
        double h = in.nextInt();
        System.out.print("Enter the base : ");
        double b = in.nextInt();
        double area = h * b ;
        System.out.println("Area of the parallelogram is " + area);
    }

    static void isoscelestriangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height : ");
        double h = in.nextInt();
        System.out.print("Enter the base : ");
        double b = in.nextInt();
        double area = 0.5 * h * b ;
        System.out.println("Area of the isosceles triangle is " + area);
    }

    static void rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double l = in.nextInt();
        System.out.print("Enter the base : ");
        double b = in.nextInt();
        double area = l * b ;
        System.out.println("Area of the rectangle is " + area);
    }

    static void triangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height : ");
        double h = in.nextInt();
        System.out.print("Enter the base : ");
        double b = in.nextInt();
        double area = 0.5 * h * b ;
        System.out.println("Area of the triangle is " + area);

    }

    static void circle(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = in.nextInt();
        double area = 3.14 * r * r ;
        System.out.println("Area of the circle is " + area);
    }

}
