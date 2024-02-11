
// * To delete the elemnt from the array
import java.util.*;

public class java40 {
    public static void func(int arr[], int num) {
        System.out.println("The new array will be");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                arr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1)
                System.out.println(arr[i]);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int no = sc.nextInt();
        int arr[] = new int[no];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the postion where to be delted");
        int num = sc.nextInt();
        func(arr, num);

    }

}
