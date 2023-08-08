package AreasandPerimeter;
import java.util.Scanner;
public class Fibonacii {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		int i;
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("FIBONACII SERIES IS: "+c);
		}
		
		
	}

}
