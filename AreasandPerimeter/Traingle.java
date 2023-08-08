package AreasandPerimeter;

public class Traingle 
{
	int base;
	int height;
	public void insertRecord(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	public void findArea()
	{
		System.out.println("Base of a Traingle is:"+base);
		System.out.println("Height of a Traingle is: "+height);
		System.out.println("============================");
		System.out.println("Area of Traingle is :"+0.5*(base*height));
	}
}
