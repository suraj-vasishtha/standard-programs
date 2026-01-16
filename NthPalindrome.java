//wap to print nth palindrome

import java.util.Scanner;

class NthPalindrome {
    
    // Method to check palindrome
    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        return original == reverse;
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
        int number = 1;

        while (true) {
            if (isPalindrome(number)) {
                count++;
            }
            if (count == n) {
                System.out.println("Nth palindrome number is: " + number);
                break;
            }
            number++;
        }

        sc.close();
    }
}
