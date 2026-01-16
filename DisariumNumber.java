// wap to check weather given num is disarium num or not

// A Disarium number is a number in which the sum of its digits powered with their respective positions is equal to the number itself.

import java.util.Scanner;

class DisariumNumber {

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

    // Method to check Disarium number
    static boolean isDisarium(int num) {
        int digits = countDigits(num);
        int sum = 0;
        int temp = num;

        // Calculate sum of digits powered with their positions
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
            digits--; // position from left to right
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isDisarium(num)) {
            System.out.println("Disarium number");
        } else {
            System.out.println("Not a Disarium number");
        }

        sc.close();
    }
}
