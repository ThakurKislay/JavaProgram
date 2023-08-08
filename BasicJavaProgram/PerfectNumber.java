package BasicJavaProgram;

import java.util.Scanner;

public class PerfectNumber 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to check Perfect no or not:");
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==num)
	{
		System.out.println("Yes " +num+" is a Perfect Number");
	}
	else
	{
		System.out.println("No "+num+" it is not a Perfect number:");
	}
}
}
