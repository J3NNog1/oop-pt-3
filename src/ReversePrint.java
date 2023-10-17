//below ive printed in reverse order

public class ReversePrint {
    public static void main(String[] args) {
        printNumbersReversed(5);
    }
    public static void printNumbersReversed(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumbersReversed(n - 1);
    }
}
