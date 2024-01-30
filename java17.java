/* 
* Print number to a given value 
*/
import java.util.*;
public class java17
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter any number");
            int no=sc.nextInt();
            int num=1;
            while(num<=no)
            {
                System.out.println(num);
                num=num+1;

            }
        }
    }
}

