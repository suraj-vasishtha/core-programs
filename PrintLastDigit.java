// wap to print last digits in a given number

import java.util.Scanner;

class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;

        System.out.println("Last digit = " + lastDigit);
    }
}
