//~ print the largest of 3
import java.util.*;
public class java12
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter fist number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            System.out.println("Enter third number");
            int c=sc.nextInt();
            if(a>b&&a>c)
            System.out.println(a+" is greater");
            else if(b>a&&b>c)
            System.out.println(b+" is greater");
            else
            System.out.println(c+" is greater");




        }
    }
}