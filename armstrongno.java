/* 

   153 is an Armstrong number because:
   1^3 + 5^3 + 3^3 = 153

*/
import java.util.*;
public class armstrongno

{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      armstrongno obj = new armstrongno();
      int n,l,d,s=0,nc;
      System.out.println("Enter a number to check if it is an Armstrong number:");
      n=in.nextInt();
      nc=n;
      l=obj.digitcounter(n);
      while(n!=0)
      {
         d=n%10;
         s=s+(int)Math.pow(d,l);
         n=n/10;
      }
      obj.display(s,nc);
      in.close();
   }
   int digitcounter(int n)
   {
      int c=0;
      while(n>0)
      {
         c++;
         n=n/10;
      }
      return c;
   }
   void display(int s,int nc)
   {
      if(s==nc)
         System.out.println(nc+" is an Armstrong number.");
      else
         System.out.println(nc+" is not an Armstrong number.");
   }
}