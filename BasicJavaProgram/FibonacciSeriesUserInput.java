package BasicJavaProgram;
import java.util.Scanner;
public class FibonacciSeriesUserInput 
{
	public static void main(String[] args) 
	{
		int a,b,c,i,n=1;
		a=0;
		b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}
}
