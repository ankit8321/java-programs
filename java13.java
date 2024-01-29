/* 
~ variable=condition?satement 1 : statement2;
*/
import java.util.*;
public class java13
{
    public static void main(String args[])
    {
      /*
       * TO FIND THE GREATER BETWEEN TWO NUMBER
        & Right side of ":" is true and left side will be false
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println("Enter another number");
        int nums=sc.nextInt();
        int result=(num>nums)?num:nums;
        System.out.println("The larger number is"+result);
        */
        
      //* CHECK IF A STUDENT WILL PASS OR FAIL
      try(Scanner sc=new Scanner(System.in))
      {
      System.out.println("Enter your marks");
      int marks=sc.nextInt();
      String result=(marks>=33)?"pass":"Fail";
      System.out.println("Your result status: "+result);
    }



  
      
    }

}