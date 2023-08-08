package BasicJavaProgram;
import java.util.*;
public class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
		for(int i=1;;i++)
		{
			if(i%a==0 && i%b==0 && i%c==0)
			{
				System.err.println("LCM IS " +i);
				break;
			}
		}
	}

}
