import java.util.Scanner;

public class java41 {
    // arr[2,4,6,8,10,12,14]
    // 0,1,2,3,4,5,6,7,8
    public static int func(int arr[], int ele) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == ele) {
                return mid;
            }
            if (arr[mid] < ele) {
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.println("Enter the elemnet to be search");
        int ele = sc.nextInt();
        int found = func(arr, ele);
        System.out.println("The element found is " + found);

    }

}
