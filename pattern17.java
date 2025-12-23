/* 

   6666
   555
   44
   3

*/
public class pattern17
{
    public static void main(String args[])
    {
        int n=4,num=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
                System.out.print(num);
            num--;
            System.out.println();
        }
    }
}