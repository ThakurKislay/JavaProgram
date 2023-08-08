package BasicJavaProgram;

import java.util.Scanner;

public class SumOfNaturalNo 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number till add");
	int num=sc.nextInt();
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
		System.out.println(i);
	}
	System.out.println("Sum of Numbers is:");
	System.out.println(sum);
}
}
