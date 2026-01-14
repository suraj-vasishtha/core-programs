//wap to print the sum of num.s in between the range which are divisible by the given num is 5 and range is 1 t

class SumDivisibleBy5 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
