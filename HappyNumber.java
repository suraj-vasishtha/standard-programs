// wap to check given num is happynum or not

// A Happy Number is a number which eventually reaches 1 when replaced by the sum of the squares of its digits repeatedly.

import java.util.Scanner;

class HappyNumber {

    // Method to calculate sum of squares of digits
    static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    // Method to check happy number
    static boolean isHappy(int num) {
        int slow = num, fast = num;

        // Use Floyd's cycle detection algorithm
        do {
            slow = sumOfSquares(slow); // move one step
            fast = sumOfSquares(sumOfSquares(fast)); // move two steps
        } while (slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not a Happy number");
        }

        sc.close();
    }
}
