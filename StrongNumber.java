// wap to check whether given num is a Strong num or not

// A Strong number is a number where the sum of factorials of its digits is equal to the original number.

import java.util.Scanner;

class StrongNumber {

    // Method to find factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }

        sc.close();
    }
}
