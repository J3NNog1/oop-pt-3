//below ive create a fibonacci series

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = (34);
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
