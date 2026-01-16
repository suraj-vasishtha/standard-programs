// wap to find nth prime num

import java.util.Scanner;

class NthPrimeNumber {

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int count = 0;
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                count++;
            }

            if (count == n) {
                System.out.println("Nth prime number is: " + number);
                break;
            }
            number++;
        }

        sc.close();
    }
}
