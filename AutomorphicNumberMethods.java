// wap to check given num is automorphic or not using methods

import java.util.Scanner;

class AutomorphicNumberMethods {

    // Method to count digits of a number
    static int countDigits(int num) {
        int count = 0;
        if (num == 0) return 1; // 0 has 1 digit
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to check Automorphic number
    static boolean isAutomorphic(int num) {
        int square = num * num;
        int digits = countDigits(num);
        int power = (int) Math.pow(10, digits);

        return square % power == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }

        sc.close();
    }
}
