import java.util.Scanner;

class demo{
     public static void main(String args[])
     {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter your income : ");
        int a = k.nextInt();   
        
        if(a > 7000) System.out.print("Scholarship is avil");
        else System.out.print("Scholarship is not avil");
     }
}
