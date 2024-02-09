
//* Linear Search */
import java.util.*;

public class java32 {
    public static int func(int num[], int search) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Enter the marks of an array");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the elemnt to be searched");
        int search = sc.nextInt();
        int index = func(num, search);
        if (index == -1)
            System.out.println("Number not Found");
        else
            System.out.println("Number found at " + index);

    }
}