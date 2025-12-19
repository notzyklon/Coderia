import java.util.*;
public class fibonacci_recusion
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        in.close();
        System.out.println("Fibonacci series up to "+n+" terms: ");
        for(int i=0;i<n;i++)
        System.out.print(fibrec(i)+" ");
    }
    public static int fibrec(int m)
    {
        if(m==0)
            return 0;
        else if(m==1)
            return 1;
        else
            return fibrec(m-1)+fibrec(m-2);
    } 
}