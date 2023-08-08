package AreasandPerimeter;

public class Perimeter 
{
	int length;
	int breadth;
	void insertRecord(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void displayArea()
	{
		System.out.println("Length of Rectangle is: "+length);
		System.out.println("Breadth of Rectangle is: "+breadth);
		System.out.println("==================================");
		System.out.println("Area of Rectangle is: "+length*breadth);
	}
	void displayPerimeter()
	{
		System.out.println("Perimeter of a Rectangle is: "+2*(length+breadth));
	}
	
}
