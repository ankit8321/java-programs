
// *Finding the largest element using using max or min infinity
import java.util.*;

public class java34 {
    public static int func(int array[], int size) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
            if (largest < array[i])
                largest = array[i];
        return largest;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        int largest = func(array, size);
        System.out.println("The largest number is" + largest);

    }
}