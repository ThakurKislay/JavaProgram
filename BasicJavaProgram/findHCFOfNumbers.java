package BasicJavaProgram;

import java.util.Scanner;
public class findHCFOfNumbers 
{
public static void main(String[] args) 
{
	int lcm=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter Second Number:");
	int b=sc.nextInt();
	System.out.println("Enter Third number:");
	int c=sc.nextInt();
	for(int i=1;i<=a && i<=b;i++)
	{
		if(a%i==0 && b%i==0 && c%i==0)
		{
			lcm=i;
		}
	}
	System.out.println("HCF of Numbers "+a+" , "+b+ " and " +c+ " = "+lcm);
}
}
