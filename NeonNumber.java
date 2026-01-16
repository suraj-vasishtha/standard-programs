// wap to check given num is neon num or not

//A Neon number is a number where the sum of digits of its square is equal to the original number.

import java.util.Scanner;

class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == num) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a Neon number");
        }

        sc.close();
    }
}
