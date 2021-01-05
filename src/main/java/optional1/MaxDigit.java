package optional1;

public class MaxDigit {

    static void Digits(int n) {

        int largest = 0;

        while (n != 0) {
            int r = n % 10;

            // Find the largest digit
            largest = Math.max(r, largest);

            n = n / 10;
        }
        System.out.println("Max digit is: " + largest);
    }
}
