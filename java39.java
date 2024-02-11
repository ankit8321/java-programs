
// * Adding element in a given position
import java.util.*;

public class java39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int no = sc.nextInt();
        int arr[] = new int[no + 1];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position where the element to be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter the elemnted which is to be inserted");
        int ele = sc.nextInt();
        System.out.println("The new array will be");
        for (int i = no; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = ele;
        no++;
        for (int i = 0; i < no; i++) {
            System.out.println(arr[i]);
        }

    }
}