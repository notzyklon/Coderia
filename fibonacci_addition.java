import java.util.Scanner;

public class fibonacci_addition
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:(includes 0)");
        n=in.nextInt();
        in.close();
        System.out.println("The sum of fibonacci numbers is: " + fibadd(n-1));
    }
    public static int fibadd(int m)
    {
        if(m<=1)
            return m;
        else
            return fibadd(m-1)+fibadd(m-2)+1;
    }
}