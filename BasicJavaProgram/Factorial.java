package BasicJavaProgram;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		int n,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		System.out.println("Factorial of given number is: ! "+n);
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			//System.out.println(fact);
		}
		System.out.println(fact);
		
	}

}
