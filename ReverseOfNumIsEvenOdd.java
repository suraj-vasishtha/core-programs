//wap to check wheather reverse of a num is even/odd

import java.util.Scanner;

class ReverseOfNumIsEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (reverse % 2 == 0) {
            System.out.println("Reverse number is EVEN");
        } else {
            System.out.println("Reverse number is ODD");
        }
    }
}
