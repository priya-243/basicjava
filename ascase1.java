package inheritance;

public class ascase1 
{
	public static void add()
	{
		System.out.println("addition");
	}
	private static void sub()
	{
		System.out.println("subtraction");
	}
	protected void mul()
	{
		System.out.println("multiplication");
	}
	void div()
	{
		System.out.println("division");
	}
	public static void main(String[] args)
	{
		add();
		sub();
		ascase1 a1=new ascase1();
		a1.mul();
		a1.div();
		
	}

}
