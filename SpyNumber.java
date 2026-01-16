// wap to check given num is a spy or not

// A Spy number is a number where the sum of its digits is equal to the product of its digits.

import java.util.Scanner;

class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        if (sum == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a Spy number");
        }

        sc.close();
    }
}
