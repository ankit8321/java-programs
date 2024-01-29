//* SWITCH STATEMENT
import java.util.*;
public class java14
{
    public static void main(String args[])
    {
    try(Scanner sc=new Scanner(System.in))
    {
        System.out.println("Enter any number");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:System.out.println("Ankit");
            break;
            case 2:System.out.println("Ankush");
            break;
            case 3:System.out.println("Rahul");
            break;
            case 4:System.out.println("Amit");
            break;
            default:System.out.println("No name ");

        }
    }
    }
}