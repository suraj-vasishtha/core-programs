// WAP to count the factors of a given number

import java.util.Scanner;

class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {   // i is a factor
                count++;
            }
        }

        System.out.println("Number of factors of " + n + " = " + count);
    }
}
