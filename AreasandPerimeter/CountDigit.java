package AreasandPerimeter;
import java.util.Scanner;
public class CountDigit 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int num,count=0;
	System.out.println("Enter number is: ");
	num=sc.nextInt();
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	System.out.println("Total digit in a number is:"+count);
}
}

