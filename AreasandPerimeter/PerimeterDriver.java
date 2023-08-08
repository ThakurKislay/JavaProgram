package AreasandPerimeter;

public class PerimeterDriver {

	public static void main(String[] args) 
	{
		Perimeter p1=new Perimeter();
		p1.insertRecord(11, 12);
		p1.displayArea();
		p1.displayPerimeter();
		System.out.println("=============================");
		Perimeter p2=new Perimeter();
		p2.insertRecord(5,6);
		p2.displayArea();
		p2.displayPerimeter();
	}

}
