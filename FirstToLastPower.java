//wap to print the exponential of first digit to the power of last digit

import java.util.Scanner;

class FirstToLastPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int result = 1;
        for (int i = 1; i <= lastDigit; i++) {
            result = result * firstDigit;
        }

        System.out.println("Result = " + result);
    }
}
