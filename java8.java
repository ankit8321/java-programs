//Print the largest of 2
import java.util.*;
public class java8
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            if(a>b)
            System.out.println(a+" is greater than "+b);
            else
            System.out.println(b+" is greater than "+a);


        }
    }
}