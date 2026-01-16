// wap to print the non-Fibonacci series

import java.util.Scanner;

class NonFibonacciSeries {

    // Method to generate Fibonacci numbers
    static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return (num == a || num == b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many Non-Fibonacci numbers to print: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.print("Non-Fibonacci numbers: ");
            int count = 0;
            int num = 1;

            while (count < n) {
                if (!isFibonacci(num)) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        }

        sc.close();
    }
}
