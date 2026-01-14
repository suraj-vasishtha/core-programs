// WAP to print product of even numbers between a given range

import java.util.Scanner;

class ProductOfEvenNumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number of the range:");
        int start = sc.nextInt();

        System.out.println("Enter ending number of the range:");
        int end = sc.nextInt();

        long product = 1;   // use long for large results
        boolean foundEven = false;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {     // check even
                product *= i;
                foundEven = true;
            }
        }

        if (foundEven)
            System.out.println("Product of even numbers between " + start + " and " + end + " = " + product);
        else
            System.out.println("No even numbers found in this range.");
    }
}
