package BasicJavaProgram;
import java.util.Scanner;
public class Condition
{
public static void main(String[] args) {
	System.out.println("Enter Number to display Table of Given number:");
	//System.out.println("Table of any Number Is:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(n+" X "+i+ "=" + i*n);
	}
	//System.out.println("ENds");
}
}
