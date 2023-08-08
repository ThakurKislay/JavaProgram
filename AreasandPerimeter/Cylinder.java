package AreasandPerimeter;

public class Cylinder 
{
	int radius;
	int height;
	void insertRecord(int r,int h)
	{
		radius=r;
		height=h;
	}
	void displayArea()
	{
		System.out.println("Radius of Cylinder is: "+radius);
		System.out.println("Height of Cylinder is: "+height);
		System.out.println("Area of Cylinder is: "+3.14*radius*radius*height);
	}
	void displayCurvedSurfaceArea()
	{
		System.out.println("Curved Surface Area is: "+2*3.14*radius*height);
	}
	void displayTotalSurfaceArea()
	{
		System.out.println("Total Surfsce area is: "+2*3.14*radius*(radius+height));
	}
}
