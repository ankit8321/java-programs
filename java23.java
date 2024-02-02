
//*Function with paarameters
import java.util.*;

public class java23 {
    public static int sum(int num1, int num2) {

        int c = num1 + num2;
        return c;

    }

    public static int multiply(int num1, int num2) {
        int prod = num1 * num2;
        return prod;
    }

    public static void main(String args[]) {
        System.out.println("Enter any two numbers");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = sum(a, b);
            int prod = multiply(a, b);
            System.out.println("The sum of two numbers" + sum);
            System.out.println("The product of two numbers" + prod);

        }
    }

}
