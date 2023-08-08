package AreasandPerimeter;

public class Square 
{
	double side;
	Square()
	{
		System.out.println("");
	}
	Square(double side)
	{
		this.side=side;
	}
	public void insertRecord()
	{
		System.out.println("Entered Number is:"+side);
		System.out.println("=============================");
	}
	public void displayArea()
	{
		System.out.println("Area of Square is:"+side*side);
	}
	public void displayPerimeter()
	{
		System.out.println("Perimeter of Square:"+4*side);
	}
}