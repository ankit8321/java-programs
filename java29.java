/* 
* patter printing in java 
****
****
****
****
*/

import java.util.Scanner;

public class java29 {
    public static void patt1(int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patt2(int r, int c) {
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns");
        int c = sc.nextInt();
        patt1(r, c);

    }
}
