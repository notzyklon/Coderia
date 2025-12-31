/*
    Enter the size of the pyramid: 
    5
        *    
       * *
      *   *
     *     *
    *********
*/
import java.util.*;
public class hollowpyramid
{
    public static void main(String args[])
    {
        hollowpyramid obj = new hollowpyramid();
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the pyramid: ");
        n=in.nextInt();
        obj.hp(n);
        in.close();
    }
    void hp(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i+j==n+1||i==n||j-i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}