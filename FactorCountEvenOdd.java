import java.util.Scanner;

class FactorCountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int count = 0;

        // Count the factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Check if count is even or odd
        if (count % 2 == 0) {
            System.out.println("The number of factors of " + n + " is EVEN (" + count + ").");
        } else {
            System.out.println("The number of factors of " + n + " is ODD (" + count + ").");
        }
    }
}
