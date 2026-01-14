// WAP to halve a number without using arithmetic operator

import java.util.Scanner;

class HalveWithoutArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int half = n >> 1;   // right shift = divide by 2

        System.out.println("Half of the number = " + half);
    }
}
