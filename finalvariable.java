package BasicJavaProgram;

public class finalvariable 
{
	final double pi=3.14;
	final static int c=200;
			final int d=400;
	
	static void add()
	{
		final int a=10;
		final int b=20;
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(d-c);
	}
 
	public static void main(String[] args)
{
		add();
		finalvariable f1=new finalvariable();
		f1.sub();
		final int i;
		i=20;
		System.out.println(i);
		System.out.println(f1.pi);
		
	}


}
