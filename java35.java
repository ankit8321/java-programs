
// * Finding the second largest and smallest elemnt in an  array 
import java.util.*;

public class java35 {
    // public static int[] func(int a[], int largest)// & Function with better
    // Approach
    // Approach
    // {
    // for (int i = 1; i < a.length; i++) {
    // if (largest < a[i])
    // largest = a[i];
    // }
    // int slargest = Integer.MIN_VALUE;
    // for (int i = 1; i < a.length; i++) {
    // if (largest > a[i] && a[i] != largest)
    // slargest = a[i];

    // }
    // return slargest;
    // }

    public static int func1(int a[], int n) {// & Optimal Approach
        int largest = a[0];
        int slargest = -1;
        for (int i = 1; i < a.length; i++) {
            if (largest < a[i]) {
                slargest = largest;
                largest = a[i];

            }

        }
        return slargest;
    }

    public static int func2(int a[], int n) {
        int largest = a[0];
        int smallest = -1;
        for (int i = 0; i < a.length; i++) {
            if (largest > a[i]) {
                smallest = largest;
                largest = a[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elelments of the array");
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        // System.out.println(func(array, largest));
        System.out.println("The second largest and smallest element " + func1(array, n) + "," + func2(array, n));

    }
}