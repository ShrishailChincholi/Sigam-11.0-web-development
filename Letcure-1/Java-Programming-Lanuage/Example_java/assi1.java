// Write a Java method to compute the sum of the digits in an integer.


import java.util.Scanner;

public class assi1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int digits = sc.nextInt();

        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }

        return sumOfDigits;
    }
}

// Output
// Input an integer: 1234
// The sum is 10



 class ArmstrongCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }

        return sum == original;
    }
}

 class PrimeRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}