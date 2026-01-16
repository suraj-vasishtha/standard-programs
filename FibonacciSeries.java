// wap to print the Fibonacci series

// The Fibonacci series is a sequence where each number is the sum of the previous two numbers. Sequence: 0, 1, 1, 2, 3, 5, 8, 13, …

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }

        sc.close();
    }
}
