
// * Removing the duplicate element from the sorted or unsorted array.
import java.util.*;

public class java38 {
    public static void func(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                }
            }
        }
        System.out.print("The removed array is");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != -1)
                System.out.print(arr[i]);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 5, 5, 1, 2 };
        func(arr);

    }
}