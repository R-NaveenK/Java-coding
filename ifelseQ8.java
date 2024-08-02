import java.util.Scanner;

class ijk{
    public static void main(String args[])
    {
        Scanner l = new Scanner(System.in);

        System.out.print("Enter your salary : ");
        int i = l.nextInt();

        System.out.print("Enter your age : ");
        int j = l.nextInt();

        if(( i >= 20000)  || ( j <= 25))
        {
            System.out.print("Enter you expected loan amt : ");
            int k = l.nextInt();

            if ( k <= 50000)
            {
                System.out.print("You are eligible for loan");
            }
            if( k > 50000)
            {
                System.out.print("Max loan amt is 50000");

            }

        }
        else
        {
            System.out.print("You are not eligible for loan");
        }



    }
} 