// wap to check wheather given num is Armstrong or not

// An Armstrong number (or n-digit narcissistic number) is a number whose sum of digits raised to the power of number of digits equals the number itself.

import java.util.Scanner;

class ArmstrongNumber {

    // Method to count digits
    static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to check Armstrong number
    static boolean isArmstrong(int num) {
        int digits = countDigits(num);
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
