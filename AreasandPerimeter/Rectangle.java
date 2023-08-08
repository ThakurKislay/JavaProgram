package AreasandPerimeter;

public class Rectangle 
{
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		System.out.println("Enter the length: "+length);
		System.out.println("Enter the breadth "+breadth);
	}
	void displayArea()
	{
		System.out.println("Area of Rectangle is: "+length*breadth);
	}
	void displayPerimeter()
	{
		System.out.println("Perimeter of a Rectangle is: "+2*(length+breadth));
		
	}
	
}
