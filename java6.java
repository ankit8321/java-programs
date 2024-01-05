import java.util.*;
public class java6
{
public static void main(String args[])
{
    
    try (Scanner sc =new Scanner(System.in))
    {
        /* TYPES OF OPERATORS
         Symbols that tell compiler to perform some operation.
         For Ex:- Sum = a+b
         here a and b is operands and + and = are operator.

         Types of operators

        1.Arithematic Operators
        2.Relational Operators
        3.Logical Operators
        4.Bitwise OPerators
        5.Assignment Operators


        BINARY OPERATORS         UNARY OPERATORS

        +                        ++       
        -                        --
        *
        /
        %
       
       
        #                                               Arithematic Operators                                                          # 
        */                                               

//Addition of two numbers

System.out.println("Enter any number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int c=a+b;
System.out.println("The sum of two number is"+c);

//Substraction of two number is
System.out.println("Enter first number");
int a1=sc.nextInt();
System.out.println("Enter second number");
int b1=sc.nextInt();
int c1=a1-b1;
System.out.println("The substraction of two number is "+c1);


//Multiplication of two number is

System.out.println("Enter any numbe");
int d=sc.nextInt();
System.out.println("Enter second number");
int e=sc.nextInt();
int f=d*e;
System.out.println("The multiplication of two number is "+f);

//Divison of two number is

System.out.println("Enter any number");
int g=sc.nextInt();
System.out.println("Enter second number");
int h=sc.nextInt();
int i=g/h;
System.out.println("The divison of two number is "+i);




/*                                                             Relational Operators
==  :- equal
not :- not equal to (inequality)
>   :- greater than 
>   :- less than
>=  :- greater than equal to
<=  :- less than equal to
*/
int a2=5;
int b2=7;
System.out.println(a2>b2);
System.out.println(a2<b2);
System.out.println(a==b);

/*                                                             Logical  Operators


"&&"=Logical Operator
"||"=Logical Or
"!" =Logical not

*/
System.out.println(3>2&&3<5);
System.out.println(2>3||3<2);
System.out.println(!(3>2));                                                              


/*                                                             Assignment Operators

=  :-  used to assign the value from right to left
+= :-  First adding is done then assigning 
-= :-  First substractoin is done then assigning
*= :-  First multiplicaton is done then assigning
/= :-  First divison is done then assigning
 
*/
int A=10;
A+=10;
int B=5;
B-=3;
System.out.println(A);
System.out.println(B);




}



}
}
