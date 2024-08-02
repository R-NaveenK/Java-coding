import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = k.nextInt();   
        
        if((a%2) == 0)
        {
        System.out.print("It is even");
        }

        else
        {
        System.out.print(" It is odd");
        }
     }





}