
// * factorial of a Number
public class java25 {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++)
            fact = fact * i;
        return fact;
    }

    public static int binomial(int n, int r) {
        int no = factorial(n);
        int nos = factorial(r);
        int nums = factorial(n - r);
        int bincoeff = no / (nos * nums);
        return bincoeff;

    }

    public static void main(String args[]) {

        System.out.println(binomial(5, 3));

    }

}
/*
 * & Summary of this code
 * ? "starting from the main,the binomial method is called.After calling the
 * binomial
 * 
 * ? method the value of n and r will be 5 and 3 respectively.
 * ? factorial method will be called passing the value of n and r to num
 * individually"
 */