package BasicJavaProgram;

import java.util.Scanner;

public class Fab 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter Number is:"); 
	int a,b,c,i,n=0;
	n=sc.nextInt();
	a=0;
	b=1;
	System.out.println("FIBONACII SERIES IS:");
	System.out.println(a);
	System.out.println(b);
	//logic
	for(i=1;i<=n;i++)
	{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
