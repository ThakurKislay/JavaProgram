package AreasandPerimeter;

public class Rec 
{
	int len;
	int wid;
	Rec()
	{
		
	}
	Rec(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
		
		
	}
	public void insertData() {
		System.out.println("Length is:"+len);
		System.out.println("Width is: "+wid);
		System.out.println("=====================");
	}
	
	public void displayArea()
	{
		System.out.println("Area is"+len*wid);
	}
	public void displayPerimeter()
	{
		System.out.println("Perimeter is:"+2*(len+wid));
	}
}
		


