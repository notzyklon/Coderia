/*

   Buzz number: A number is called a Buzz number if it ends with 7 or is divisible by 7.

*/
import java.util.*;
public class buzzno
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check if it is a Buzz number:");
        n=in.nextInt();
        if(n%10==7||n%7==0)
            System.out.println(""+n+" is a Buzz number.");
        else
            System.out.println(""+n+" is not a Buzz number.");
        in.close();
    }
}