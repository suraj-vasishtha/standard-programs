// wap to count unit bits in binary

import java.util.Scanner;

class CountUnitBits {

    // Method to count 1s in binary
    static int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) { // check last bit
                count++;
            }
            num = num >> 1; // shift right
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int unitBits = countOnes(num);
        System.out.println("Number of 1s in binary: " + unitBits);

        sc.close();
    }
}
