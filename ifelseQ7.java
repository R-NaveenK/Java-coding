import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter your score : ");
        String a = k.nextLine();
        
        if(a.equals("red"))
        {
        System.out.print("Stop");
        }    
        else if(a.equals("yellow"))
        {
         System.out.print("Get ready");
        }
        else 
        {
         System.out.print("Go");
        }
     }

}