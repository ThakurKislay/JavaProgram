package BasicJavaProgram;
import java.util.Scanner;
public class ReverseofGivenNumber 
{
	public static void main(String[] args) 
	{
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		//logic
		System.out.println("REverse Number is:");
		while(n>0)
		{
			rev=n%10;
			n=n/10;
			System.out.print(rev);
		}
	}
}
