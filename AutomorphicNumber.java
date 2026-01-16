// wap to check given num is automorphic or not

// An Automorphic number is a number whose square ends with the same digits as the number itself.

import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int digits = 0;
        int power = 1;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Find 10^digits
        for (int i = 1; i <= digits; i++) {
            power = power * 10;
        }

        if (square % power == num) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }

        sc.close();
    }
}
