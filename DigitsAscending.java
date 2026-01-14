//wap toprint the digits in a num in ascending order

import java.util.Scanner;
import java.util.Arrays;

class DigitsAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 1: Count digits
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Store digits in an array
        int[] digits = new int[count];
        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Step 3: Sort the array
        Arrays.sort(digits);

        // Step 4: Print digits in ascending order
        System.out.print("Digits in ascending order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
