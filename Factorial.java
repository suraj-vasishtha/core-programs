//wap to find factorial of a number

import java.util.Scanner;

class  Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt(), fact = 1;
		for (int i = num; i >= 1; i--)
		{
			fact *= i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
}
