public class FibonacciRecursive {
    static int fibonacciNumbers(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciNumbers(n- 1) + fibonacciNumbers(n - 2);
        }
    }

    public static void main(String[] args) {
        int n =5;




        System.out.println( fibonacciNumbers(n));
    }
}
