package optional1;

public class PrimeNumbers {

    // Check whether a number is prime
    static boolean isPrime(int primeNumber) {

        if (primeNumber <= 1)
            return false;

        for (int i = 2; i < primeNumber; i++)
            if (primeNumber % i == 0)
                return false;

        return true;
    }

    // Print Prime Numbers
    static void printPrime(int primeNumber) {
        for (int i = 2; i <= primeNumber; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}
