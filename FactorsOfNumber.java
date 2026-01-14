// WAP to print factors of a number

import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {   // if i divides n exactly
                System.out.println(i);
            }
        }
    }
}
