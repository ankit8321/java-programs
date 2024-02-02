/* 
*   Function overloading depends on number and type of parameters 
*   and it does not depends on return type of function */

public class java26 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(10, 10));
        System.out.println(sum(10, 10, 10));

    }
}