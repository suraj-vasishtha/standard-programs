// wap to check given num is xylem / phloem

// Xylem number:

// The sum of first and last digits equals the sum of all other digits.


// Phloem number:

// All numbers that are not Xylem are Phloem


import java.util.Scanner;

class XylemPhloem {

    // Method to calculate sum of digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Method to check Xylem
    static boolean isXylem(int num) {
        if (num < 10) return true; // single-digit numbers are Xylem

        int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int middleSum = sumOfDigits(num) - firstDigit - lastDigit;

        return (firstDigit + lastDigit == middleSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isXylem(num)) {
            System.out.println("Xylem number");
        } else {
            System.out.println("Phloem number");
        }

        sc.close();
    }
}
