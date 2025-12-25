/*

   reverse a number in java:
   Example: 
   Input: 1234 
   Output: 4321

*/
import java.util.*;
public class reverseno
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        reverseno obj = new reverseno();
        int n;
        System.out.println("Enter a number to reverse:");
        n=in.nextInt();
        int rev=obj.reverse(n);
        System.out.println("Reversed Number: "+rev);
        in.close();
    }
    int reverse(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        return s;
    }
}