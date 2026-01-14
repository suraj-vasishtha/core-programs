// WAP to double a number without using arithmetic operator

import java.util.Scanner;

class DoubleWithoutArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int doubled = n << 1;   // left shift = multiply by 2

        System.out.println("Double of the number = " + doubled);
    }
}
