// wap to convert binary values to decimal values

import java.util.Scanner;

class BinaryToDecimal {

    // Method to convert binary string to decimal
    static int toDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char ch = binary.charAt(length - 1 - i); // right to left
            if (ch == '1') {
                decimal += Math.pow(2, i);
            } else if (ch != '0') {
                System.out.println("Invalid binary number!");
                return -1;
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.next();

        int decimal = toDecimal(binary);
        if (decimal != -1) {
            System.out.println("Decimal equivalent: " + decimal);
        }

        sc.close();
    }
}
