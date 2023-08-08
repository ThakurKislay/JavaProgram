package AreasandPerimeter;

public class ParallelogramDriver {

	public static void main(String[] args) 
	{
		Parallelogram p1=new Parallelogram(2,7,2.6);
		p1.insertRecord();
		p1.displayArea();
		Parallelogram p2=new Parallelogram(3,8,3.9);
		p2.insertRecord();
		p2.displayArea();
	}

}
