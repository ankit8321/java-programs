
//*Prime numbers */
import java.util.*;

public class java28 {
    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            // check if current number is prime
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}