
//&Rearranging the array in inccreasing-decresing order
import java.util.*;

public class java37 {
    public static void func1(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");

        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 7, 1, 6, 5, 9 };

        func1(arr);

    }
}