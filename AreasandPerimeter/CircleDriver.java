package AreasandPerimeter;

public class CircleDriver 
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.insertRecord(3);
		c1.displayArea();
		c1.displayCircumference();
		System.out.println("=========================");
		Circle c2=new Circle();
		c2.insertRecord(5);
		c2.displayArea();
		c2.displayCircumference();
	}
}
