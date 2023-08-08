package BasicJavaProgram;
import java.util.*;
public class CountTheDigit
{
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//logic
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Total no of Digit of a a number i: "+count);
	}
}
