// WAP to print exponential value of a base to the power

import java.util.Scanner;

class ExponentialValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base:");
        int base = sc.nextInt();

        System.out.println("Enter power:");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + " ^ " + power + " = " + result);
    }
}
