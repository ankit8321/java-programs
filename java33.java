
// *Standard method to find the largest number in an array
import java.util.*;

public class java33 {
    public static int func(int num[], int largest) {

        for (int j = 1; j < num.length; j++) {
            if (largest < num[j])

                largest = num[j];
        }
        return largest;
    }

    public static void main(String args[]) {
        int array[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int largest = array[0];
        int num = func(array, largest);
        System.out.println("Largest Element " + num);

    }
}