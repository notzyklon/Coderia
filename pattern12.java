/*

    *
    **
    ***
    ****
    ***
    **
    *

 */
public class pattern12
{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1;i<=(n*2)-1;i++)
        {
            for(int j=1;j<=(n*2)-1;j++)
            {
                if(i<=n)
                {
                    if(j<=i)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if(j<=(n*2)-i)
                    {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}