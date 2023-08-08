package AreasandPerimeter;
import java.util.*;
public class SumOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sum=0;
		int r;
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			//System.out.println(sum);
			num=num/10;
		}
		System.out.println("Sum is:"+sum);
	}
}
