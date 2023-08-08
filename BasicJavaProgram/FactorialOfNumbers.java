package BasicJavaProgram;
import java.util.Scanner;
public class FactorialOfNumbers 
{
	public static void main(String[] args)
	{
	System.out.println("Program start");
	int x;
	do
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(n+"!="+fact);
		System.out.println("Press 1 To continue and press any other to stop");
		x=sc.nextInt();
	}while(x==1);
	System.out.println("Program Ends:!!");
	}
}