//wap to find 2nd largest digit from the first

import java.util.Scanner;

class SecondLargestFromFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 1: Find first digit
        int temp = num;
        while (temp >= 10) {
            temp = temp / 10;
        }

        int largest = temp;
        int secondLargest = -1;

        // Remove first digit
        int power = 1;
        while (power * 10 <= num) {
            power *= 10;
        }
        num = num % power;

        // Step 2: Process remaining digits
        while (num != 0) {
            int digit = num % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit < largest && digit > secondLargest) {
                secondLargest = digit;
            }

            num = num / 10;
        }

        // Step 3: Output
        if (secondLargest == -1) {
            System.out.println("No second largest digit");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }
    }
}
