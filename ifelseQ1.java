import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter your mark : ");
        int a = k.nextInt();   
        
        if(a >= 35)
        {
        System.out.print("PASS");
        }
        else
        {
        System.out.print("FAIL");
        }
     }





}