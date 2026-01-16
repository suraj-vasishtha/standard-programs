// wap to print strong num.s in b/w the range

// A Strong number is a number whose sum of factorials of its digits is equal to the number itself.

import java.util.Scanner;

class StrongNumbersInRange {

    // Method to find factorial of a digit
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Method to check Strong number
    static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        System.out.println("Strong numbers in the given range:");

        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
