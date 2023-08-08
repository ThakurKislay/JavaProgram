package AreasandPerimeter;

public class Parallelogram 
{
	int first_side;
	int second_side;
	double height;
	Parallelogram()
	{
		System.out.println();
	}
	Parallelogram(int first_side,int second_side,double height)
	{
		this.first_side=first_side;
		this.second_side=second_side;
		this.height=height;
	}
	public void insertRecord()
	{
		System.out.println("First side of parallelogram is: "+first_side);
		System.out.println("Second side of parallelogram is: "+second_side);
		System.out.println("Height of a parallelofram:"+height);
	}
	public void displayArea()
	{
		System.out.println("Area of parallelogram is: "+ 0.5*(first_side+second_side)*height);
		System.err.println("============================");
		System.out.println("=============================================================");
	}
}
