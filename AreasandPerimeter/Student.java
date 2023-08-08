package AreasandPerimeter;

public class Student 
{
	int roll_no;
	String name;
	static String college="IIMT";
	//constructor
	Student(int r,String n)
	{
		roll_no=r;
		name=n;
	}
	void display()
	{
		System.out.println("Roll No is:"+roll_no);
		System.out.println("Name is: "+name);
		System.out.println("College Name is: "+college);
	}
}
