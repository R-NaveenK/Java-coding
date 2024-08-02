import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int a = k.nextInt();   
        
        if(a < 50)
        {
        System.out.print("You need to improve ");
        }

        else if((a >= 50) || (a <= 70))
        {
        System.out.print("Good job");
        }

        else if(a > 70)
        {
        System.out.print("Excellent performance");
        }
        else
        {
         System.out.print("Invalid score");
        }
     }





}