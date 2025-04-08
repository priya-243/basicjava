package inheritance;

public class this_1 
{
	this_1(int a)
	{
		this(10,3.14);
		System.out.println("test case 1");
	}
	this_1(int a,double b)
	{
		System.out.println("test case 2");
	}

	this_1()
	{
		this(10);
		System.out.println("test case 3");
	}

	public static void main(String[] args)
	{
		new this_1();
		
		
	}
}
