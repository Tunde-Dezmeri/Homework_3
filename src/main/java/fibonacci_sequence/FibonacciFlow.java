package fibonacci_sequence;

public class FibonacciFlow {
    private static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        try {
            int N = Integer.parseInt("10");
            if (N < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed");
            }
            System.out.println(N);
            for (int i = 1; i <= N; i++)
                System.out.println(i + ": " + fib(i));
        } catch (NumberFormatException e) {
            System.out.println("Argument needs to be a number");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FINALLY");
        }
    }
}
