/* 
function overloading using different data types
*/

public class java27 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(10, 10));
        System.out.println(sum(3.2f, 9.5f));

    }
}