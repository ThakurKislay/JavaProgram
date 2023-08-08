package BasicJavaProgram;

import java.util.Scanner;

public class SumofFactorial 
{
public static void main(String[] args) {
	int sum=0;
	int rem=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	while(num>0)
	{
		 rem=num%10;
		int fact=1;
		for(int i=1;i<=rem;i++)
		{
			fact=fact*i;
			//System.out.println("Sum is:"+sum);
			System.out.println(fact);
		}
		sum=sum+fact;
		num=num/10;
		System.out.println("Sum is:"+sum);
	}
}
}//https://www.tutorialgateway.org/java-program-to-print-even-numbers-from-1-to-n/
