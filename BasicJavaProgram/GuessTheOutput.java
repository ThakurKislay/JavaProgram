package BasicJavaProgram;

public class GuessTheOutput 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int z=(x>y)?(x++):(y--);
		System.out.println(x);//10
		System.out.println(y);//19
		
		String message="Jai,\"Balayya!\"";
		String name="Name is: ,\"Kislay Kumar!\"";
		System.out.println(message);
		System.out.println(name);
		
		String str="My name is Khan";
		System.out.println(str.substring(3,9));
		System.out.println(str.subSequence(1, 5));
	}
}
