package BasicJavaProgram;

public class Continue 
{
public static void main(String[] args) {
	for(int i=1000;i<=2000;i++)
	{
		if(i%10==4 || i%10==6)
		{
			continue;
		}
		System.out.println(i);
	}
}
}

