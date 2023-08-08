//Take a user input print and count all the factors of that number.(Number itself is not included). 
package BasicJavaProgram;

import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		//logic
		int count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("Total factor is:"+count);
	}

}
