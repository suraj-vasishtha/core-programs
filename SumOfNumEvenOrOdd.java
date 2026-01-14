//wap to check sum of no. is even/odd
import java.util.*;

class SumOfNumEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number and second number");
		int firstNo = sc.nextInt(), secondNo = sc.nextInt();
		int sum = 0;
		sum = firstNo + secondNo;
		if (sum % 2 == 0)
		{
			System.out.println("Sum is even");
		}else
			System.out.println("Sum is odd");
	}
}
