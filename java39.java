import java.util.*;

public class java39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = 5;
        int array[] = new int[no + 1];

        System.out.println("Enter the elemnts of the array");
        for (int i = 0; i < no; i++)
            array[i] = sc.nextInt();
        System.out.println("Enter the position ");
        int m = sc.nextInt();
        System.out.println("Enter the elemnt to be inserted");
        int n = sc.nextInt();
        System.out.println("The new array");
        for (int i = no; i > m; i--) {
            array[i] = array[i - 1];
        }
        array[m] = n;
        no++;
        for (int i = 0; i < no; i++) {
            System.out.print(array[i]);
        }

    }
}