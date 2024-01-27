/*
income<5L
0% Tax
income between 5-10L
20% Tax
income>10L
30% Tax
*/
import java.util.*;
public class java11
{
    public static void main(String args[])
    {
       
        try(Scanner sc=new Scanner(System.in))
        {
            int tax=0;
            System.out.println("Enter your salary");
            int salary=sc.nextInt();
            
            if(salary<500000)
            {
                System.out.println("Your are not tax paybale");
            }
            else if(salary>=500000 && salary<1000000)
            {
                tax=(int)(salary*0.2);

            }
            else if(salary>=100000)
            {
                tax=(int)(salary*0.3);

            }
            System.out.println("Your tax is" + tax);
            


           

        }
    }
}