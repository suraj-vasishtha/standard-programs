// wap to check whether given num is twisted prime or not

//A Twisted Prime is a number that is:
//Prime, and
//Its reverse is also prime

import java.util.Scanner;

class TwistedPrime {

    // Method to check prime
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to reverse number
    static int reverseNumber(int num) {
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = reverseNumber(num);

        if (isPrime(num) && isPrime(reversed)) {
            System.out.println("Twisted Prime number");
        } else {
            System.out.println("Not a Twisted Prime number");
        }

        sc.close();
    }
}
