/*
*passing the array in function parameter using
* call by reference in java */
public class java31 {
    public static void func(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }

    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        func(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
    }
}