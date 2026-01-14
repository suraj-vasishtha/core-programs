// WAP to print sum of even numbers between a given range

import java.util.Scanner;

class SumOfEvenNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number of the range:");
        int start = sc.nextInt();

        System.out.println("Enter ending number of the range:");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {   // check even
                sum += i;
            }
        }

        System.out.println("Sum of even numbers between " + start + " and " + end + " = " + sum);
    }
}
