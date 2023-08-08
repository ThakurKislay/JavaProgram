package BasicJavaProgram;

import java.util.Scanner;

public class SimpleIntrest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle: ");
		int p=sc.nextInt();
		System.out.println("Enter rate: ");
		int r=sc.nextInt();
		System.out.println("Enter time");
		int t=sc.nextInt();
		double simple_intrest=(p*r*t)/100;
		System.out.println("Simple Interst is : "+simple_intrest);
	}
}
