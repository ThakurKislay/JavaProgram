package BasicJavaProgram;
import java.util.Scanner;
public class CountOfDigits 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be counted....");
		int num=sc.nextInt();
		//logic
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Total digits of a number is:.....");
		System.out.println(count);
	}
	
}
