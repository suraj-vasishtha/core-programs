class SumDivisibleByNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        int divisor = 5;

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) { // check divisibility
                sum += i;
            }
        }

        System.out.println("Sum of numbers between " + start + " and " + end +
                           " divisible by " + divisor + " = " + sum);
    }
}
