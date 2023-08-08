package AreasandPerimeter;

public class RectangleDrivrt {

	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(5,3);
		r1.displayArea();
		r1.displayPerimeter();
		System.out.println("=====================");
		Rectangle r2=new Rectangle(5,0);
		r2.displayArea();
		r2.displayPerimeter();
	}

}
