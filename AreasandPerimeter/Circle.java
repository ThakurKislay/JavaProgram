
package AreasandPerimeter;

public class Circle 
{
	float radius;
	void insertRecord(float r)
	{
		radius=r;
	}
	void displayArea()
	{
		System.out.println("Radius of Circle is:" +radius);
		System.out.println("Area of Circle is: "+3.14*radius*radius);
	}
	void displayCircumference()
	{
		System.out.println("Circumference of Circle is: "+2*3.14*radius);
	}
}
