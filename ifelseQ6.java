import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter your score : ");
        int a = k.nextInt();
        System.out.print("Enter your score : ");
        int b = k.nextInt();
        System.out.print("Enter your score : ");
        int c = k.nextInt();
        System.out.print("Enter your score : ");
        int d = k.nextInt();
        System.out.print("Enter your score : ");
        int e = k.nextInt(); 

        int x = ( a + b + c + d + e ) / 5 ;
        
        if(x < 35)
        {
        System.out.print("You need additional class ");
        }    
        else
        {
         System.out.print("Good to go");
        }
     }





}
