package BasicJavaProgram;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a,b,c,i;
		a=0;
		b=1;
		//logic
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		System.out.println("Fibonaci series is:");
		System.out.print(a);
		System.out.print(" "+b);
		
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" " +c);
		}
	}
}
