//wap to priny sum of numbers based on user input

import java.util.Scanner;

class SumOfNumbersUserIp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers to add");
		int total = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<= total; i++)
		{
			System.out.println("enter the "+i+"th number");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("final sum = "+sum);
	}
}
