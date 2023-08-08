package AreasandPerimeter;

public class TraingleDriver 
{
public static void main(String[] args)
{
	Traingle obj=new Traingle();
	obj.insertRecord(12, 7);
	obj.findArea();
	Traingle obj1=new Traingle();
	obj1.insertRecord(11, 9);
	System.err.println("==============================================");
	obj1.findArea();
}
}
