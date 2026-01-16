// wap to check whether given num is perfect num or not

// Perfect Num: A perfect number is a number whose sum of its proper divisors (excluding the number itself) is equal to the number.

import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Not a perfect number");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }

        sc.close();
    }
}
