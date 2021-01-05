package optional1;

import static optional1.MaxDigit.Digits;
import static optional1.PrimeNumbers.printPrime;
import static optional1.SmallestNumberInArray.getSmallestNumber;

public class Main {

    public static void main(String... args) {

        // task 1)
        int total = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (int nmb = 1; nmb <= 100; nmb++) {

            total += nmb;
            stringBuilder.append(nmb);
            if (nmb != 100)
                stringBuilder.append("+");

        }
        stringBuilder.append(" = " + total);
        System.out.println(stringBuilder.toString());

        // task2)
        Integer [] a = {1, 2, 5, 6, 3, 2, 0, 11, 16, 20};
        System.out.println("Smallest number is: " + getSmallestNumber(a, 10));

        // task 3)
        int n = 587;
        Digits(n);

        // task 4)
        int num = 1221, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        // palindrome if originalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome");
        else
            System.out.println(originalInteger + " is not a palindrome");

        // task 5)
        int primeNumber = 7;
        printPrime(primeNumber);
    }
}
