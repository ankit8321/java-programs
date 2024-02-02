
// * factorial of a Number
import java.util.*;

public class java24 {
    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact = fact * i;
        return fact;

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int no = sc.nextInt();
            int facts = fact(no);
            System.out.println(facts);
        }

    }

}
