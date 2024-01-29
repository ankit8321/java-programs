// *Calculator using switch case

import java.util.*;
public class java15
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter first number");
        int no=sc.nextInt();
        System.out.println("Enter second number");
        int num=sc.nextInt();
        System.out.println("Enter any operator");
        char input=sc.next().charAt(0);
        switch(input)
        {
            case '+':System.out.println("Adding two numbers");
            System.out.println(no+num);
            break;
            case '-':System.out.println("Subtracting two number");
            System.out.println(no-num);
            break;
            case '*':System.out.println("Multiplying two numbers");
            int resultss=no*num;
            System.out.println(resultss);
            break;
            case '/':System.out.println("Dividing two numbers"); 
            System.out.println(no/num);
            break;
            case '%':System.out.println("Remainder of two numbers");
            System.out.println(no%num);
            break;
            default:System.out.println("Wrong Input");



        }
    }
    }
}