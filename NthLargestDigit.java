// wap to print nth largest digit in a given num

import java.util.Scanner;
import java.util.Arrays;

class NthLargestDigit {

    // Method to extract digits into an array
    static int[] getDigits(int num) {
        int length = 0;
        int temp = num;
        if (num == 0) length = 1;
        else {
            while (temp > 0) {
                length++;
                temp /= 10;
            }
        }

        int[] digits = new int[length];
        temp = num;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to find nth largest digit
    static int nthLargestDigit(int num, int n) {
        int[] digits = getDigits(num);
        Arrays.sort(digits); // ascending order

        if (n > digits.length || n <= 0) return -1;

        return digits[digits.length - n]; // nth largest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter n (nth largest digit): ");
        int n = sc.nextInt();

        int result = nthLargestDigit(num, n);

        if (result != -1) {
            System.out.println(n + "th largest digit is: " + result);
        } else {
            System.out.println("Invalid input! n is larger than number of digits or non-positive.");
        }

        sc.close();
    }
}
