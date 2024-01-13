import java.util.*;
public class java10
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter your age");
            int age=sc.nextInt();
            if(age>=18)
            System.out.println("Bjp or Congoress");
            else if(age>=13 && age<18)
            System.out.println("Abe tu hai kon");
            else
            System.out.println("Ghar jaa chutye,bada aya vote dene");



        }


    }
}