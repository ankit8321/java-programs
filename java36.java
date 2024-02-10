
//* Reverse an array
import java.util.*;

public class java36 {
    public static void func() {
        try (Scanner sc = new Scanner(System.in)) {
            String array[] = { "A", "B", "C", "D" };
            int arr[] = { 1, 2, 3, 4, 5 };
            // System.out.println("Enter elements of array");
            // for (int i = 0; i < array.length; i++)
            // array[i] = sc.nextInt();
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(array[j]);
                if (j == 0)
                    break;
            }
            System.out.println();
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(arr[j]);
                if (j == 0)
                    break;
            }
        }
    }

    public static void main(String args[]) {
        func();
    }

}
