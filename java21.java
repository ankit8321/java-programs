//* PRINT REVERSE OF A NUMBER USING FOR LOOP
import java.util.*;
public class java21
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
         System.out.println("Enter any digits");
         int no=sc.nextInt();
         int l,rev=0;
         while(no>0)
         {
            l=no%10;
            rev=(rev*10)+l;
            no=no/10;
         }
         System.out.println(rev);
         
         

           
        }

        
    }
}