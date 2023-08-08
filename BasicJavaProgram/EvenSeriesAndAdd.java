package BasicJavaProgram;

import java.util.Scanner;

public class EvenSeriesAndAdd 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int sum=0;
	int i=0;
	System.out.println("Even No series is:"+num);
	for(i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
