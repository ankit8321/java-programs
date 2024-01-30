//*SUM OF N NATURAL NUMBERS
import java.util.*;
public class java18
{
    public static void main(String ar[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter any number");
            int num=sc.nextInt();
            int sum=0,no=0;

            while(no<=num)
            {
                sum=sum+no;
                no=no+1;


            }
            System.out.println(sum);

        


        }
    }
}