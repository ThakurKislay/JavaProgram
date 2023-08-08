package AreasandPerimeter;

public class Trapezium 
{
	int first_side;
	int second_side;
	int height;
	public void insertRecord(int first_side,int second_side,int height)
	{
		this.first_side=first_side;
		this.second_side=second_side;
		this.height=height;
	}
	public void getArea()
	{
		System.out.println("Area of Trapezium is: "+0.5*(first_side+second_side)*height+"SQ.unit");
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter of a Trapezium is: "+first_side+second_side);
	}
}
