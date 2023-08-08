package AreasandPerimeter;
import java.util.*;
public class ReverseNumber 
{
public static void main(String[] args) 
{
	int rev;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number is:");
	int num=sc.nextInt();
	//rev
	System.out.println("REverse Number is:");
	while(num>0)
	{
	rev=num%10;
	System.out.print(rev);
	num=num/10;
	}
}
}
