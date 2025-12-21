/*

   ******
    ******
     ******
      ******

*/
public class pattern10
{
    public static void main(String args[])
    {
        int m=4,n=6;
        for(int i=1;i<=m;i++)
        {
            for(int k=1;k<=n;k++)
            {
                    System.out.print("*");
            }
            System.out.println();
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
        }
    }
}