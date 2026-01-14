import java.util.Scanner;

class SubtractWithoutArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (minuend):");
        int a = sc.nextInt();

        System.out.println("Enter second number (subtrahend):");
        int b = sc.nextInt();

        while (b != 0) {
            int borrow = (~a) & b;  // borrow where a has 0 and b has 1
            a = a ^ b;              // subtraction without borrow
            b = borrow << 1;        // shift borrow left
        }

        System.out.println("Result of subtraction = " + a);
    }
}
