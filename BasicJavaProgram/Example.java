package BasicJavaProgram;
import java.util.Scanner;
public class Example 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number is:");
	int num=sc.nextInt();
	int sum=0;
	int i=0;
	for(i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			System.out.println(i);
			
		}
	}

	
}
}
