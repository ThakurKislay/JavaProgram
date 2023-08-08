package BasicJavaProgram;
import java.util.Scanner;
public class AddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int first_number=sc.nextInt();
		System.out.println("Enter Second Number:");
		int second_number=sc.nextInt();
		int result=first_number+second_number;
		System.out.println("Sum Of Numbers is:"+result);
				
	}
}
