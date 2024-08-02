import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = k.nextInt();   
        
        if((a%3 == 0)&&(a%5 == 0))
        {
        System.out.print("It is divisible by 3 and 5 ");
        }
        else
        {
        System.out.print("It is not divisible by 3 and 5 ");
        }
     }





}