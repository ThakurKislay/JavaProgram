package AreasandPerimeter;
import java.util.Scanner;
public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		//logic;
		System.out.println("Reverse no is: ");
		while(num>0)
		{
			int rev;
			rev=num%10;
			
			System.out.print(rev);
			num=num/10;
		}
	}
	
}
