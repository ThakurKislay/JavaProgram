package BasicJavaProgram;

public class BreakKeyword 
{
	public static void main(String[] args) 
	{
		for(int i=1;;i++)
		{
			System.out.println(i);
			if(i>=20)
			{
				break;
			}
		}
	}
}
