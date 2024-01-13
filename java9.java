//PRINT IF A NUMBER IS ODD OR EVEN
import java.util.*;
public class java9
{
public static void main(String args[])
{
    try(Scanner sc=new Scanner(System.in))
    {
        System.out.println("Enter any number");
        int no=sc.nextInt();
        if(no%2==0)
        System.out.println("Even Nummber");
        else
        System.out.println("Odd number");


    }
}
}