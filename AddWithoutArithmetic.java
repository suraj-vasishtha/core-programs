// WAP to add two numbers without using arithmetic operators

import java.util.Scanner;

class AddWithoutArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        while (b != 0) {
            int carry = a & b;   // AND gives the carry
            a = a ^ b;           // XOR gives partial sum
            b = carry << 1;      // shift carry left
        }

        System.out.println("Sum = " + a);
    }
}
