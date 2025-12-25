import java.util.*;
public class swapusingxor
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers to swap:");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        in.close();
    }
}