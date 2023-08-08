package BasicJavaProgram;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) 
	{
		int n,r,sum=0;
		System.out.println("Enter the number: ");
		Scanner sc=new  Scanner(System.in);
		n=sc.nextInt();
		//logic
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of Numbers is: "+sum);
	}

}
