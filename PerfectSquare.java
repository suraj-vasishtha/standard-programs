// wap to check whether given num is perfect square or not

// A perfect square is a number that is the square of an integer.

import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not a perfect square");
        } else {
            int sqrt = (int) Math.sqrt(num);

            if (sqrt * sqrt == num) {
                System.out.println("Perfect square");
            } else {
                System.out.println("Not a perfect square");
            }
        }

        sc.close();
    }
}
