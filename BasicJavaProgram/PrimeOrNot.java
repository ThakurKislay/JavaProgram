package BasicJavaProgram;
import java.util.Scanner;
public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//logic
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number"+n);
		}
		else
		{
			System.out.println("Not a Prime Number:"+n);
		}
	}
}
