package BasicJavaProgram;
import java.util.Scanner;
public class QuotientRemainder 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Divident");
	int divident=sc.nextInt();
	System.out.println("Enter Divisior");
	int divisior=sc.nextInt();
	int quotient=divident/divisior;
	int remainder=divident%divisior;
	System.out.println("The Quotient is:"+quotient);
	System.out.println("The Remainder is:"+remainder);
}
}
