package Wrapper_Class;

import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		double x=sc.nextDouble();
		String p=Double.toString(x);
		System.out.println("Total digit id:"+p.length());
	}
}
