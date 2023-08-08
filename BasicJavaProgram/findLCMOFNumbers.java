package BasicJavaProgram;
import java.util.Scanner;
public class findLCMOFNumbers 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number:");
	int a=sc.nextInt();
	System.out.println("Enter Second Number:");
	int b=sc.nextInt();
	System.out.println("Enter Third Number:");
	int c=sc.nextInt();
	for(int i=1; ;i++)
	{
		if(i%a==0 && i%b==0 && i%c==0)
		{
			System.out.println("LCM of Given Number is:"+i);
			break; 
		}
	}
}
}
