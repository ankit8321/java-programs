//To do sum,multiple,divide using scanner


import java.util.*;
public class java5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

//Sum of two numbers

System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int sum=a+b;
System.out.println("The sum of two number is "+sum);


// Product of two numbers
System.out.println("Enter any number");
int c=sc.nextInt();
System.out.println("Enter second number");
int d=sc.nextInt();
int product=c*d;
System.out.println("The product of two number is "+product);

//Divison of two number
System.out.println("Enter any number");
int e=sc.nextInt();
System.out.println("Enter second number");
int f=sc.nextInt();
int div=e/f;
System.out.println("The divison of two number is"+div);

}
}