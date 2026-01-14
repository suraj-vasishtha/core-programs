import java.util.Scanner;

class FactorsOfSumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number of the range:");
        int start = sc.nextInt();

        System.out.println("Enter ending number of the range:");
        int end = sc.nextInt();

        // Calculate sum of numbers in the range
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from " + start + " to " + end + " = " + sum);
        System.out.println("Factors of the sum:");

        // Print factors of the sum
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                System.out.println(i);
            }
        }
    }
}
