package AreasandPerimeter;

public class Student2 
{
	int roll_no;
	String name;
	double fee;
	//constructor
	Student2(int roll_no,String name,double fee)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println("Roll No is: "+roll_no);
		System.out.println("Name is:" +name);
		System.out.println("Fees is: "+fee);
	}
	
}
