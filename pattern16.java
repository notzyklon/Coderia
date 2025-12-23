/*

   3
   44
   555
   6666

*/
public class pattern16
{
   public static void main(String args[])
   {
      int n=4,num=3;
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=i;j++)
            System.out.print(num);
         num++;
         System.out.println();
      }
   }
}