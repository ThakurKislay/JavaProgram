package BasicJavaProgram;

import java.util.Scanner;

public class PerfectNum 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	int sum=0;
	//int count=0;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
			//System.out.println(i);
			//count++;
		}
	}
		if(sum==num)
		{
			System.out.println(num+" Is a Perfect no");
		}
		else
		{
			System.out.println(num+" Is not a Perfect no");
		}
		
}
}
