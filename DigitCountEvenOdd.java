//wap to check wheather count of digit in a num is even or odd

import java.util.Scanner;

class DigitCountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        if (count % 2 == 0) {
            System.out.println("Count of digits is EVEN");
        } else {
            System.out.println("Count of digits is ODD");
        }
    }
}
