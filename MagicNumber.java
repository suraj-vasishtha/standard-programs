// wap to check given num is magic num or not

// A Magic number is a number where the repeated sum of its digits eventually becomes 1.

import java.util.Scanner;

class MagicNumber {

    // Method to sum digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Method to check magic number
    static boolean isMagic(int num) {
        int sum = num;

        while (sum > 9) { // repeat until single-digit
            sum = sumOfDigits(sum);
        }

        return sum == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isMagic(num)) {
            System.out.println("Magic number");
        } else {
            System.out.println("Not a Magic number");
        }

        sc.close();
    }
}
