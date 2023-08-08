package AreasandPerimeter;

public class Cuboid 
{
	int length;
	int width;
	int height;
	public void insertRecord(int length,int width,int height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void dispalyVolume()
	{
		System.out.println("Volume of Cuboid is: "+(length*width*height) +"Cubic unit");
	}
	public void displayCurvedSurfaceArea()
	{
		System.out.println("Curved Surface Area of Cuboid is: "+2*(length+width)*height+ "Sq. unit");
	}
	public void displayTotalSurfaceArea() 
	{
		System.out.println("Total Surface Area is: "+2*(length*width+width*height+height*length) +" sq. unit");
	}
}
