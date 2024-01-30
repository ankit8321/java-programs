//*SUM OF FIRST N PRIME NUMBER */
import java.util.*;
public class java19
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int i=1,no=1,count=0,sum=0;
            System.out.println("Enter any number");
            int num=sc.nextInt();

            while(no<=num)
            {
                count=0;
                i=1;
                while(i<=10)
                {
                    
                    if(no%i==0)
                    count=count+1;
                    i=i+1;
                }
                if(count==2)
                sum=sum+no;
                no=no+1;
            }
            System.out.println("The sum is "+sum);
            









        }
            
    }
}