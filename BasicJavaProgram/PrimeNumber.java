package BasicJavaProgram;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		//logic
		for(int i=1;i<=n;i++)
		{
			count++;
		}
		if(count%2==0)
		{
			System.out.println("Prime Number:"+n);
		}
		else
		{
			System.out.println("Not a Prime Number"+n);
		}
	}
}
