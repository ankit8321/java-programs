//Conditional Statements

import java.util.*;
public class java7
{
    public static void main(String args[])
    {

        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter your age");
            int age=sc.nextInt();
             if(age>=13&&age<18)
            {
                System.out.println("Teenager");
            }
            if(age>18)
            {
             System.out.println("Your eligale  to vote");
            }
        
        
            else
            System.out.println("Your not eligale  to vote");
        }
        
           




        }

 
}