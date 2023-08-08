package BasicJavaProgram;
import java.util.*;
public class Reverse {

	public static void main(String[] args) 
	{
		System.out.println("Please enter the number to be Reversed:===");
		int n,rev;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//logic
		System.out.print("Reverse No is: ");
		while(n>0)
		{
		rev=n%10;
		System.out.print(rev);
		n=n/10;
		//System.out.println(rev);
		}
	}
	

}
