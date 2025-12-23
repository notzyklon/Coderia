/*

       *
      **
     ***
    ****
     ***
      **
       *
       
*/
public class pattern13
{
    public static void main(String args[])
    {
        int n=4,vh=n+2;
        for(int i=1;i<=(n*2)-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=n)
                {
                    if(i+j>=n+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if(i+j>vh)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            if(i>n)
                vh+=2;
            System.out.println();
        }
    }
}