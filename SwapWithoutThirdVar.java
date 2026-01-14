// WAP to swap two variables without using a third variable (Arithmetic method)

import java.util.Scanner;

class SwapWithoutThirdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (a):");
        int a = sc.nextInt();

        System.out.println("Enter second number (b):");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
