package AreasandPerimeter;

public class PracticeExampled 
{
	int len;
	int bre;
	PracticeExampled()
	{
		
	}
	PracticeExampled(int l,int b)
	{
		len=l;
		bre=b;
	}
	void insertRecord()
	{
		System.out.println("length is "+len);
		System.out.println("Breadth is "+bre);
	}
	void displayValue()
	{
		System.out.println("Area of Rectangle is"+len*bre);
		System.err.println("=============================");
	}
}